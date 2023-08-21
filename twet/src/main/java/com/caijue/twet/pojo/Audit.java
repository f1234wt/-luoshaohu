package com.caijue.twet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 审核表
 * @TableName twet_audit
 */
@TableName(value ="twet_audit")
public class Audit implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 特卫id
     */
    private Long tId;

    /**
     * 管理员id
     */
    private Long userId;

    /**
     * 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    private Long result;

    /**
     * 审核意见
     */
    private String reason;

    /**
     * 等级（默认为E：初级，D：低级，C:中级，B：高级，A：精英）
     */
    private String garde;

    /**
     * 提交时间
     */
    private Date createTime;

    /**
     * 审批时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 特卫id
     */
    public Long gettId() {
        return tId;
    }

    /**
     * 特卫id
     */
    public void settId(Long tId) {
        this.tId = tId;
    }

    /**
     * 管理员id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 管理员id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    public Long getResult() {
        return result;
    }

    /**
     * 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    public void setResult(Long result) {
        this.result = result;
    }

    /**
     * 审核意见
     */
    public String getReason() {
        return reason;
    }

    /**
     * 审核意见
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 等级（默认为E：初级，D：低级，C:中级，B：高级，A：精英）
     */
    public String getGarde() {
        return garde;
    }

    /**
     * 等级（默认为E：初级，D：低级，C:中级，B：高级，A：精英）
     */
    public void setGarde(String garde) {
        this.garde = garde;
    }

    /**
     * 提交时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 提交时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 审批时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 审批时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Audit other = (Audit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.gettId() == null ? other.gettId() == null : this.gettId().equals(other.gettId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getGarde() == null ? other.getGarde() == null : this.getGarde().equals(other.getGarde()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((gettId() == null) ? 0 : gettId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getGarde() == null) ? 0 : getGarde().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tId=").append(tId);
        sb.append(", userId=").append(userId);
        sb.append(", result=").append(result);
        sb.append(", reason=").append(reason);
        sb.append(", garde=").append(garde);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}