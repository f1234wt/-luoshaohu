package com.caijue.twet.reqModel;

import javax.validation.constraints.NotNull;

public class InfoReq {
    /**
     * 特卫id
     */
    @NotNull(message = "特卫id不能为空")
    private Long tId;

    /**
     * 特卫姓名
     */
    @NotNull(message = "特卫姓名不能为空")
    private String tName;
    /**
     * 特卫身份证
     */
    @NotNull(message = "身份证号不能为空")
    private String tCardid;
    /**
     * 特卫户籍
     */
    @NotNull(message = "户籍不能为空")
    private String tAddress;
    /**
     * 特卫年龄
     */
    @NotNull(message = "年龄不能为空")
    private Long tAge;
    /**
     * 特卫身高（单位/cm）
     */
    @NotNull(message = "身高不能为空")
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
     * 车型
     */
    private String carModel;
    /**
     * 特卫等级
     */
    private String grade;
    /**
     * 审核结果 审核结果（默认未0：待审核。1：通过，2：不通过）
     */
    private Long result;
    /**
     * 个人爱好
     */
    private String tLike;
    /**
     * 个人评价
     */
    private String ownAppraise;
    /**
     * 服务格言
     */
    private String serviceMotto;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettCardid() {
        return tCardid;
    }

    public void settCardid(String tCardid) {
        this.tCardid = tCardid;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public Long gettAge() {
        return tAge;
    }

    public void settAge(Long tAge) {
        this.tAge = tAge;
    }

    public Long gettHeight() {
        return tHeight;
    }

    public void settHeight(Long tHeight) {
        this.tHeight = tHeight;
    }

    public String getArmsKind() {
        return armsKind;
    }

    public void setArmsKind(String armsKind) {
        this.armsKind = armsKind;
    }

    public Long getArmsAge() {
        return armsAge;
    }

    public void setArmsAge(Long armsAge) {
        this.armsAge = armsAge;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Long getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Long driverAge) {
        this.driverAge = driverAge;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long auditResult) {
        this.result = result;
    }

    public String gettLike() {
        return tLike;
    }

    public void settLike(String tLike) {
        this.tLike = tLike;
    }

    public String getOwnAppraise() {
        return ownAppraise;
    }

    public void setOwnAppraise(String ownAppraise) {
        this.ownAppraise = ownAppraise;
    }

    public String getServiceMotto() {
        return serviceMotto;
    }

    public void setServiceMotto(String serviceMotto) {
        this.serviceMotto = serviceMotto;
    }
}
