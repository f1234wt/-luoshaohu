package com.caijue.twet.service;

import com.caijue.twet.pojo.Audit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caijue.twet.reqModel.AuditReq;

/**
* @author Lenovo
* @description 针对表【twet_audit(审核表)】的数据库操作Service
* @createDate 2023-08-01 15:09:35
*/
public interface AuditService extends IService<Audit> {
    //审核特卫方法
    void audit(AuditReq auditReq);
}
