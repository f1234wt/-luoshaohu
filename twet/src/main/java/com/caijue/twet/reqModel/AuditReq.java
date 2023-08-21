package com.caijue.twet.reqModel;

import javax.validation.constraints.NotNull;

public class AuditReq {
    /**
     * 特卫id
     */
    @NotNull(message ="正在审核的特卫id不能为空")
    private Long tId;

    /**
     * 管理员id
     */
    private Long userId;

    /**
     * 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    @NotNull(message = "审核结果不能为空")
    private Long result;

    /**
     * 审核意见
     */
    @NotNull(message = "审核意见不能为空")
    private String reason;

    /**
     * 等级（默认为E：初级，D：低级，C:中级，B：高级，A：精英）
     */
    private String garde;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getGarde() {
        return garde;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }
}
