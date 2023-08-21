package com.caijue.twet.service;

import com.caijue.twet.pojo.Info;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caijue.twet.reqModel.InfoReq;
import com.caijue.twet.vo.InfoListVo;
import com.caijue.twet.vo.InfoVo;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Lenovo
* @description 针对表【twet_info(特卫信息表)】的数据库操作Service
* @createDate 2023-08-02 16:58:20
*/
public interface InfoService extends IService<Info> {
    //添加特卫
    void insertInfo(InfoReq infoReq);
    //上传图片和资质
    void upload(Long tid, String t_attribute, MultipartFile file, HttpServletRequest request);
    //返回列表（前端）
    PageInfo list(Integer pageNum, Integer pageSize);
    //返回列表后端
    PageInfo adminlist(Integer pageNum, Integer pageSize);
    //特卫搜索
    List<InfoListVo> selectlist(String name);
    //特卫详情
    InfoVo selectInfo(Long tid);
}
