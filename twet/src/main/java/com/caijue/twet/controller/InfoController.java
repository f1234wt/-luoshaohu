package com.caijue.twet.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.caijue.twet.common.ApiRestResponse;
import com.caijue.twet.common.Constant;
import com.caijue.twet.exception.MallException;
import com.caijue.twet.exception.MallExceptionEnum;
import com.caijue.twet.pojo.Info;
import com.caijue.twet.reqModel.AuditReq;
import com.caijue.twet.reqModel.InfoReq;
import com.caijue.twet.service.AuditService;
import com.caijue.twet.service.InfoService;
import com.caijue.twet.util.URIUtils;
import com.caijue.twet.vo.InfoListVo;
import com.caijue.twet.vo.InfoVo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/twets/product")
public class InfoController {
    @Resource
    private InfoService infoService;
    @Resource
    private AuditService auditService;

    @ApiOperation("添加特卫")
    @PostMapping("/add")
    public ApiRestResponse add(@Valid @RequestBody InfoReq infoReq){//传入的对应参数应该为特卫信息表的req对象的json字符串
        infoService.insertInfo(infoReq);
        return ApiRestResponse.success();
    }

    @ApiOperation("上传图片和资质")
    @PostMapping("/upload")
    public ApiRestResponse upload(Long tid,String t_attribute,MultipartFile file, HttpServletRequest request) {
        infoService.upload(tid,t_attribute,file,request);
        return ApiRestResponse.success();
    }

    @ApiOperation("特卫审核")
    @PostMapping("/audit")
    public ApiRestResponse audit(@Valid @RequestBody AuditReq auditReq){
        auditService.audit(auditReq);
        return ApiRestResponse.success();
    }

    @ApiOperation("特卫信息列表（前台）")
    @GetMapping("/list")
    public ApiRestResponse list(Integer pageNum,Integer pageSize){
        PageInfo pageInfo = infoService.list(pageNum, pageSize);
        return ApiRestResponse.success(pageInfo);
    }

    @ApiOperation("特卫信息列表（后台）")
    @GetMapping("/adminlist")
    public ApiRestResponse adminlist(Integer pageNum,Integer pageSize){
        PageInfo pageInfo = infoService.adminlist(pageNum, pageSize);
        return ApiRestResponse.success(pageInfo);
    }
    @ApiOperation("特卫详情")
    @PostMapping("/select")
    public ApiRestResponse select(Long tid){
        InfoVo infoVo = infoService.selectInfo(tid);
        return ApiRestResponse.success(infoVo);
    }
    @ApiOperation("特卫搜索")
    @PostMapping("/like")
    public ApiRestResponse selectLike(String name){
        List<InfoListVo> infoListVos = infoService.selectlist(name);
        return ApiRestResponse.success(infoListVos);
    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void score(){

    }
}
