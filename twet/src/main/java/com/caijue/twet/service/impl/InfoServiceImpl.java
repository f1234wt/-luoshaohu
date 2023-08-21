package com.caijue.twet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caijue.twet.common.Constant;
import com.caijue.twet.exception.MallException;
import com.caijue.twet.exception.MallExceptionEnum;
import com.caijue.twet.mapper.AuditMapper;
import com.caijue.twet.pojo.Audit;
import com.caijue.twet.pojo.Info;
import com.caijue.twet.reqModel.InfoReq;
import com.caijue.twet.service.InfoService;
import com.caijue.twet.mapper.InfoMapper;
import com.caijue.twet.util.Score;
import com.caijue.twet.util.URIUtils;
import com.caijue.twet.vo.InfoListVo;
import com.caijue.twet.vo.InfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
* @author Lenovo
* @description 针对表【twet_info(特卫信息表)】的数据库操作Service实现
* @createDate 2023-08-01 10:40:37
*/
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info>
    implements InfoService {

    @Resource
    private InfoMapper infoMapper;
    @Resource
    private AuditMapper auditMapper;

    /**
     * 添加特卫的方法（文字性）
     */
    @Override
    public void insertInfo(InfoReq infoReq) {
        //查询特卫信息表根据传入参数的姓名和身份证(校验同名)
        Info info = infoMapper.selectOne(new QueryWrapper<Info>().eq("t_id", infoReq.gettId()));
        //如果身份证查询同位不为空
        if (info == null) {
            //说明该特卫已存在,抛出(特卫不存在)
            throw new MallException(MallExceptionEnum.NO_ORDER);
        }
        //创建特卫信息表的实体对象，进行快速赋值并插入表
        BeanUtils.copyProperties(infoReq, info);
        int insert = infoMapper.updateById(info);
        if (insert == 0) {
            //插入失败异常
            throw new MallException(MallExceptionEnum.UPDATE_FAILED);
        }
    }

    @Override
    public void upload(Long tid, String t_attribute, MultipartFile file, HttpServletRequest request) {
        //获得图片生成的路径
        String upload = upload(file, request);
        //根据特卫id拿到对应的特卫对象
        Info info = infoMapper.selectOne(new QueryWrapper<Info>().eq("t_id", tid));
        if (info == null)//该特卫为空
            throw new MallException(MallExceptionEnum.NO_ORDER);
        if (t_attribute.equalsIgnoreCase("tImage")) {
            //判断是否是微信头像
            info.settImage(upload);
        } else if (t_attribute.equalsIgnoreCase("tCardImage")) {
            //判断是否是身份证图片
            info.settCardImage(upload);
        } else if (t_attribute.equalsIgnoreCase("driverImage")) {
            //判断是否是驾驶证图片
            info.setDivingImage(upload);
        } else if (t_attribute.equalsIgnoreCase("divingImage")) {
            //判断是否是行驶证图片
            info.setDivingImage(upload);
        } else if (t_attribute.equalsIgnoreCase("skill1")) {
            //判断是否是技能证书1图片
            info.setSkill1(upload);
        } else if (t_attribute.equalsIgnoreCase("skill2")) {
            //判断是否是技能证书2图片
            info.setSkill2(upload);
        } else if (t_attribute.equalsIgnoreCase("skill3")) {
            //判断是否是技能证书3图片
            info.setSkill3(upload);
        } else if (t_attribute.equalsIgnoreCase("skill4")) {
            //判断是否是技能证书4图片
            info.setSkill4(upload);
        } else {//参数错误
            throw new MallException(MallExceptionEnum.REQUEST_PARAM_ERROR);
        }
        int i = infoMapper.updateById(info);
        if (i == 0) {//图片上传失败
            throw new MallException(MallExceptionEnum.UPLOAD_FAILED);
        }
    }

    /**
     * 文件上传的方法
     *
     * @param file
     * @param request
     */
    private String upload(MultipartFile file, HttpServletRequest request) {
        //获取源文件名称
        String fileNameOld = file.getOriginalFilename();
        //获取源文件名的后缀
        String suffix = fileNameOld.substring(fileNameOld.lastIndexOf("."));
        //生成新的文件名
        UUID uuid = UUID.randomUUID();
        String newFileName = uuid.toString() + suffix;
        //获取图片保存路径
        File fileDir = new File(Constant.FILE_UPLOAD_DIR);
        //判断文件上传目录是否存在
        if (!fileDir.exists()) {
            if (!fileDir.mkdir()) {
                throw new MallException(MallExceptionEnum.MKDIR_FAILED);
            }
        }
        //定义新文件
        File newfile = new File(Constant.FILE_UPLOAD_DIR + newFileName);
        //将源文件copy到新文件上
        try {
            file.transferTo(newfile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String url = "";
        try {
            URI host = URIUtils.getHost(new URI(request.getRequestURL() + ""));

            url = url + host + "/images/" + newFileName;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        return url;
    }

    @Override
    public PageInfo list(Integer pageNum, Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 10;
        //开启分页（根据更新时间的倒序排序）
        PageHelper.startPage(pageNum, pageSize, "update_time desc");
        //给用户看（已经通过审核的特卫）
        List<Info> infos = infoMapper.selectList(new QueryWrapper<Info>().eq("result", Constant.SaleStatus.SALE));
        //判断是否为空
        if (infos == null || infos.size() == 0)
            throw new MallException(MallExceptionEnum.NOT_ENOUGH);
        List<InfoListVo> infoListVos = new ArrayList<>();
        for (Info info : infos) {
            InfoListVo listVo = new InfoListVo();
            BeanUtils.copyProperties(info, listVo);
            infoListVos.add(listVo);
        }
        return new PageInfo(infoListVos);
    }

    @Override
    public PageInfo adminlist(Integer pageNum, Integer pageSize) {
        if (pageNum == null)
            pageNum = 1;
        if (pageSize == null)
            pageSize = 10;
        //开启分页（根据更新时间的倒序排序）
        PageHelper.startPage(pageNum, pageSize, "update_time desc");
        //给用户看（已经通过审核的特卫）
        List<Info> infos = infoMapper.selectList(null);
        //判断是否为空
        if (infos == null || infos.size() == 0)
            throw new MallException(MallExceptionEnum.NOT_ENOUGH);
        List<InfoVo> infoVos = new ArrayList<>();
        for (Info i : infos) {
            InfoVo infoVo = new InfoVo();
            BeanUtils.copyProperties(i, infoVo);
            infoVos.add(infoVo);
        }
        PageInfo pageInfo = new PageInfo(infoVos);
        return pageInfo;
    }

    @Override
    public List<InfoListVo> selectlist(String name) {
        QueryWrapper<Info> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("t_name", name);
        List<Info> infos = infoMapper.selectList(queryWrapper);
        if (infos == null || infos.size() == 0) {
            throw new MallException(MallExceptionEnum.NOT_ENOUGH);
        }
        List<InfoListVo> infoListVos = new ArrayList<>();
        for (Info info : infos) {
            InfoListVo listVo = new InfoListVo();
            BeanUtils.copyProperties(info, listVo);
            infoListVos.add(listVo);
        }
        return infoListVos;
    }

    @Override
    public InfoVo selectInfo(Long tid) {
        Info info = infoMapper.selectOne(new QueryWrapper<Info>().eq("t_id", tid));
        InfoVo infoVo = new InfoVo();
        BeanUtils.copyProperties(info, infoVo);
        return infoVo;
    }

    @Scheduled(cron = "0/60 * * * * ? ")//定时任务60秒执行一次
    public void averagescore() {
        //拿到所有符合条件的特卫（通过审核的）
        List<Info> tIds = infoMapper.selectList(new QueryWrapper<Info>().eq("result", Constant.SaleStatus.SALE));
        //循环遍历
        for (Info info : tIds) {
            //查询到对应id的所有已经完成订单的疏浚
            List<Score> scores = infoMapper.score(Long.valueOf(Constant.SaleStatus.SALE), Constant.OrderStatusEnum.FINISHED.getValue(), info.gettId());
            Long sorce = 0l;//总分
            Integer cisu = scores.size();//总共完成的订单数
            if (scores.size() != 0) {
                for (Score s : scores) {
                    if (s.getScore() == null) {
                        cisu--;//当评分为零时，次数减一
                    } else {
                        sorce = sorce + s.getScore();
                    }
                }
                //循环结束后次数不为空，说明该特卫有已经完成的订单，且有评价
                if (cisu != 0) {
                    //得到对应的平均分
                    double floor = sorce / scores.size() + 0.0f;
                    //根据平均分设置对应的等级
                    if (floor<=Constant.score.CANCELED.getCode() ) {//1.0
                        info.setScore(floor);//设置平均分
                        info.setGarde(Constant.score.CANCELED.getValue());//设置等级
                    } else if (floor <= Constant.score.NOT_PAID.getCode()) {//2.0
                        info.setScore(floor);//设置平均分
                        info.setGarde(Constant.score.NOT_PAID.getValue());//设置等级
                    } else if (floor <= Constant.score.PAID.getCode()) {//3.0
                        info.setScore(floor);//设置平均分
                        info.setGarde(Constant.score.PAID.getValue());//设置等级
                    } else if (floor <= Constant.score.DELIVERED.getCode()) {//4.0
                        info.setScore(floor);//设置平均分
                        info.setGarde(Constant.score.DELIVERED.getValue());//设置等级
                    } else if (floor <= Constant.score.FINISHED.getCode()) {//5.0
                        info.setScore(floor);//设置平均分
                        info.setGarde(Constant.score.FINISHED.getValue());//设置等级
                    }
                    int update = infoMapper.updateById(info);//更新平均分和等级
                }
            }

        }

    }
}




