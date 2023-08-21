package com.caijue.twet.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 特卫信息表
 * @TableName twet_info
 */
@TableName(value ="twet_info")
public class Info implements Serializable {
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
     * 特卫姓名
     */
    private String tName;

    /**
     * 特卫头像图片
     */
    private String tImage;

    /**
     * 特卫身份证
     */
    private String tCardid;

    /**
     * 特卫身份证照片
     */
    private String tCardImage;

    /**
     * 特卫户籍
     */
    private String tAddress;

    /**
     * 特卫年龄
     */
    private Long tAge;

    /**
     * 特卫身高（单位/cm）
     */
    private Long tHeight;

    /**
     * 兵种
     */
    private String armsKind;

    /**
     * 兵龄
     */
    private Long armsAge;

    /**
     * 学历
     */
    private String education;

    /**
     * 驾龄
     */
    private Long driverAge;

    /**
     * 驾驶证照片
     */
    private String driverImage;

    /**
     * 行驶证照片
     */
    private String divingImage;

    /**
     * 车型
     */
    private String carModel;

    /**
     * 手机号
     */
    private String tPhone;

    /**
     * 技能证书1
     */
    private String skill1;

    /**
     * 技能证书2
     */
    private String skill2;

    /**
     * 技能证书3
     */
    private String skill3;

    /**
     * 技能证书4
     */
    private String skill4;

    /**
     * 特卫等级
     */
    private String garde;

    /**
     * 审核结果 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    private Long result;

    /**
     * 接单状态（默认未0：未接单。1：已接单）
     */
    private Integer receive;
    /**
     * 个人爱好
     */
    private String tLike;

    /**
     * 个人评价
     */
    private String ownAppraise;

    /**
     * 平均分
     */
    private Double score;

    /**
     * 服务格言
     */
    private String serviceMotto;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
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
     * 特卫姓名
     */
    public String gettName() {
        return tName;
    }

    /**
     * 特卫姓名
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * 特卫头像图片
     */
    public String gettImage() {
        return tImage;
    }

    /**
     * 特卫头像图片
     */
    public void settImage(String tImage) {
        this.tImage = tImage;
    }

    /**
     * 特卫身份证
     */
    public String gettCardid() {
        return tCardid;
    }

    /**
     * 特卫身份证
     */
    public void settCardid(String tCardid) {
        this.tCardid = tCardid;
    }

    /**
     * 特卫身份证照片
     */
    public String gettCardImage() {
        return tCardImage;
    }

    /**
     * 特卫身份证照片
     */
    public void settCardImage(String tCardImage) {
        this.tCardImage = tCardImage;
    }

    /**
     * 特卫户籍
     */
    public String gettAddress() {
        return tAddress;
    }

    /**
     * 特卫户籍
     */
    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    /**
     * 特卫年龄
     */
    public Long gettAge() {
        return tAge;
    }

    /**
     * 特卫年龄
     */
    public void settAge(Long tAge) {
        this.tAge = tAge;
    }

    /**
     * 特卫身高（单位/cm）
     */
    public Long gettHeight() {
        return tHeight;
    }

    /**
     * 特卫身高（单位/cm）
     */
    public void settHeight(Long tHeight) {
        this.tHeight = tHeight;
    }

    /**
     * 兵种
     */
    public String getArmsKind() {
        return armsKind;
    }

    /**
     * 兵种
     */
    public void setArmsKind(String armsKind) {
        this.armsKind = armsKind;
    }

    /**
     * 兵龄
     */
    public Long getArmsAge() {
        return armsAge;
    }

    /**
     * 兵龄
     */
    public void setArmsAge(Long armsAge) {
        this.armsAge = armsAge;
    }

    /**
     * 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 驾龄
     */
    public Long getDriverAge() {
        return driverAge;
    }

    /**
     * 驾龄
     */
    public void setDriverAge(Long driverAge) {
        this.driverAge = driverAge;
    }

    /**
     * 驾驶证照片
     */
    public String getDriverImage() {
        return driverImage;
    }

    /**
     * 驾驶证照片
     */
    public void setDriverImage(String driverImage) {
        this.driverImage = driverImage;
    }

    /**
     * 行驶证照片
     */
    public String getDivingImage() {
        return divingImage;
    }

    /**
     * 行驶证照片
     */
    public void setDivingImage(String divingImage) {
        this.divingImage = divingImage;
    }

    /**
     * 车型
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 车型
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 手机号
     */
    public String gettPhone() {
        return tPhone;
    }

    /**
     * 手机号
     */
    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    /**
     * 技能证书1
     */
    public String getSkill1() {
        return skill1;
    }

    /**
     * 技能证书1
     */
    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    /**
     * 技能证书2
     */
    public String getSkill2() {
        return skill2;
    }

    /**
     * 技能证书2
     */
    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    /**
     * 技能证书3
     */
    public String getSkill3() {
        return skill3;
    }

    /**
     * 技能证书3
     */
    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    /**
     * 技能证书4
     */
    public String getSkill4() {
        return skill4;
    }

    /**
     * 技能证书4
     */
    public void setSkill4(String skill4) {
        this.skill4 = skill4;
    }

    /**
     * 特卫等级
     */
    public String getGarde() {
        return garde;
    }

    /**
     * 特卫等级
     */
    public void setGarde(String garde) {
        this.garde = garde;
    }

    /**
     * 审核结果 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    public Long getResult() {
        return result;
    }

    /**
     * 审核结果 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    public void setResult(Long result) {
        this.result = result;
    }
    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }


    /**
     * 个人爱好
     */
    public String gettLike() {
        return tLike;
    }

    /**
     * 个人爱好
     */
    public void settLike(String tLike) {
        this.tLike = tLike;
    }

    /**
     * 个人评价
     */
    public String getOwnAppraise() {
        return ownAppraise;
    }

    /**
     * 个人评价
     */
    public void setOwnAppraise(String ownAppraise) {
        this.ownAppraise = ownAppraise;
    }

    /**
     * 平均分
     */
    public Double getScore() {
        return score;
    }

    /**
     * 平均分
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 服务格言
     */
    public String getServiceMotto() {
        return serviceMotto;
    }

    /**
     * 服务格言
     */
    public void setServiceMotto(String serviceMotto) {
        this.serviceMotto = serviceMotto;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
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
        Info other = (Info) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.gettName() == null ? other.gettName() == null : this.gettName().equals(other.gettName()))
            && (this.gettImage() == null ? other.gettImage() == null : this.gettImage().equals(other.gettImage()))
            && (this.gettCardid() == null ? other.gettCardid() == null : this.gettCardid().equals(other.gettCardid()))
            && (this.gettCardImage() == null ? other.gettCardImage() == null : this.gettCardImage().equals(other.gettCardImage()))
            && (this.gettAddress() == null ? other.gettAddress() == null : this.gettAddress().equals(other.gettAddress()))
            && (this.gettAge() == null ? other.gettAge() == null : this.gettAge().equals(other.gettAge()))
            && (this.gettHeight() == null ? other.gettHeight() == null : this.gettHeight().equals(other.gettHeight()))
            && (this.getArmsKind() == null ? other.getArmsKind() == null : this.getArmsKind().equals(other.getArmsKind()))
            && (this.getArmsAge() == null ? other.getArmsAge() == null : this.getArmsAge().equals(other.getArmsAge()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getDriverAge() == null ? other.getDriverAge() == null : this.getDriverAge().equals(other.getDriverAge()))
            && (this.getDriverImage() == null ? other.getDriverImage() == null : this.getDriverImage().equals(other.getDriverImage()))
            && (this.getDivingImage() == null ? other.getDivingImage() == null : this.getDivingImage().equals(other.getDivingImage()))
            && (this.getCarModel() == null ? other.getCarModel() == null : this.getCarModel().equals(other.getCarModel()))
            && (this.gettPhone() == null ? other.gettPhone() == null : this.gettPhone().equals(other.gettPhone()))
            && (this.getSkill1() == null ? other.getSkill1() == null : this.getSkill1().equals(other.getSkill1()))
            && (this.getSkill2() == null ? other.getSkill2() == null : this.getSkill2().equals(other.getSkill2()))
            && (this.getSkill3() == null ? other.getSkill3() == null : this.getSkill3().equals(other.getSkill3()))
            && (this.getSkill4() == null ? other.getSkill4() == null : this.getSkill4().equals(other.getSkill4()))
            && (this.getGarde() == null ? other.getGarde() == null : this.getGarde().equals(other.getGarde()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.gettLike() == null ? other.gettLike() == null : this.gettLike().equals(other.gettLike()))
            && (this.getOwnAppraise() == null ? other.getOwnAppraise() == null : this.getOwnAppraise().equals(other.getOwnAppraise()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getServiceMotto() == null ? other.getServiceMotto() == null : this.getServiceMotto().equals(other.getServiceMotto()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * 特卫id
     * @return
     */
    public Long gettId() {
        return tId;
    }

    /**
     * 特卫id
     * @param tId
     */
    public void settId(Long tId) {
        this.tId = tId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((gettName() == null) ? 0 : gettName().hashCode());
        result = prime * result + ((gettImage() == null) ? 0 : gettImage().hashCode());
        result = prime * result + ((gettCardid() == null) ? 0 : gettCardid().hashCode());
        result = prime * result + ((gettCardImage() == null) ? 0 : gettCardImage().hashCode());
        result = prime * result + ((gettAddress() == null) ? 0 : gettAddress().hashCode());
        result = prime * result + ((gettAge() == null) ? 0 : gettAge().hashCode());
        result = prime * result + ((gettHeight() == null) ? 0 : gettHeight().hashCode());
        result = prime * result + ((getArmsKind() == null) ? 0 : getArmsKind().hashCode());
        result = prime * result + ((getArmsAge() == null) ? 0 : getArmsAge().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getDriverAge() == null) ? 0 : getDriverAge().hashCode());
        result = prime * result + ((getDriverImage() == null) ? 0 : getDriverImage().hashCode());
        result = prime * result + ((getDivingImage() == null) ? 0 : getDivingImage().hashCode());
        result = prime * result + ((getCarModel() == null) ? 0 : getCarModel().hashCode());
        result = prime * result + ((gettPhone() == null) ? 0 : gettPhone().hashCode());
        result = prime * result + ((getSkill1() == null) ? 0 : getSkill1().hashCode());
        result = prime * result + ((getSkill2() == null) ? 0 : getSkill2().hashCode());
        result = prime * result + ((getSkill3() == null) ? 0 : getSkill3().hashCode());
        result = prime * result + ((getSkill4() == null) ? 0 : getSkill4().hashCode());
        result = prime * result + ((getGarde() == null) ? 0 : getGarde().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((gettLike() == null) ? 0 : gettLike().hashCode());
        result = prime * result + ((getOwnAppraise() == null) ? 0 : getOwnAppraise().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getServiceMotto() == null) ? 0 : getServiceMotto().hashCode());
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
        sb.append(", tName=").append(tName);
        sb.append(", tImage=").append(tImage);
        sb.append(", tCardid=").append(tCardid);
        sb.append(", tCardImage=").append(tCardImage);
        sb.append(", tAddress=").append(tAddress);
        sb.append(", tAge=").append(tAge);
        sb.append(", tHeight=").append(tHeight);
        sb.append(", armsKind=").append(armsKind);
        sb.append(", armsAge=").append(armsAge);
        sb.append(", education=").append(education);
        sb.append(", driverAge=").append(driverAge);
        sb.append(", driverImage=").append(driverImage);
        sb.append(", divingImage=").append(divingImage);
        sb.append(", carModel=").append(carModel);
        sb.append(", tPhone=").append(tPhone);
        sb.append(", skill1=").append(skill1);
        sb.append(", skill2=").append(skill2);
        sb.append(", skill3=").append(skill3);
        sb.append(", skill4=").append(skill4);
        sb.append(", garde=").append(garde);
        sb.append(", result=").append(result);
        sb.append(", tLike=").append(tLike);
        sb.append(", ownAppraise=").append(ownAppraise);
        sb.append(", score=").append(score);
        sb.append(", serviceMotto=").append(serviceMotto);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}