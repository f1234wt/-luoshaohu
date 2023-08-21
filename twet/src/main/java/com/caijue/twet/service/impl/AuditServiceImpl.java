package com.caijue.twet.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caijue.twet.common.Constant;
import com.caijue.twet.exception.MallException;
import com.caijue.twet.exception.MallExceptionEnum;
import com.caijue.twet.mapper.InfoMapper;
import com.caijue.twet.pojo.Audit;
import com.caijue.twet.pojo.Info;
import com.caijue.twet.reqModel.AuditReq;
import com.caijue.twet.service.AuditService;
import com.caijue.twet.mapper.AuditMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
* @author Lenovo
* @description 针对表【twet_audit(审核表)】的数据库操作Service实现
* @createDate 2023-08-01 15:09:35
*/
@Service
public class AuditServiceImpl extends ServiceImpl<AuditMapper, Audit>
    implements AuditService{


    @Resource
    private AuditMapper auditMapper;
    @Resource
    private InfoMapper infoMapper;
    @Override
    public void audit(AuditReq auditReq){
        //根据id查询到审核表内的对应对象
        Audit audit = auditMapper.selectOne(new QueryWrapper<Audit>().eq("t_id",auditReq.gettId()).eq("result", Constant.SaleStatus.Ao_SALE));
        if(audit==null) //没有查到该对象
            throw new MallException(MallExceptionEnum.NO_ENUM);
        //根据id查询到信息表内的对应对象
        Info info = infoMapper.selectOne(new QueryWrapper<Info>().eq("t_id", auditReq.gettId()));
        //更新审核表内的审核参数
        BeanUtils.copyProperties(auditReq,audit);
        audit.setUpdateTime(new Date());
        int i = auditMapper.updateById(audit);
        if(i==0){ //更新失败
            throw new MallException(MallExceptionEnum.UPDATE_FAILED);
        }
        //更新信息表内的审核参数
        info.setResult(audit.getResult());
        int i1 = infoMapper.updateById(info);
        if(i1==0){ //更新失败
            throw new MallException(MallExceptionEnum.UPDATE_FAILED);
        }
    }
}




