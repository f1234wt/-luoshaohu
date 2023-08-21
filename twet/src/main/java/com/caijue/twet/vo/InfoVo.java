package com.caijue.twet.vo;

/**
 * 特卫列表的返回对象
 */
public class InfoVo {
    /**
     * 特卫id
     */
    private Long tid;
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

    public Long getId() {
        return tid;
    }

    public void setId(Long tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettImage() {
        return tImage;
    }

    public void settImage(String tImage) {
        this.tImage = tImage;
    }

    public String gettCardid() {
        return tCardid;
    }

    public void settCardid(String tCardid) {
        this.tCardid = tCardid;
    }

    public String gettCardImage() {
        return tCardImage;
    }

    public void settCardImage(String tCardImage) {
        this.tCardImage = tCardImage;
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

    public String getDriverImage() {
        return driverImage;
    }

    public void setDriverImage(String driverImage) {
        this.driverImage = driverImage;
    }

    public String getDivingImage() {
        return divingImage;
    }

    public void setDivingImage(String divingImage) {
        this.divingImage = divingImage;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getSkill4() {
        return skill4;
    }

    public void setSkill4(String skill4) {
        this.skill4 = skill4;
    }

    public String getGarde() {
        return garde;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long auditResult) {
        this.result = auditResult;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getServiceMotto() {
        return serviceMotto;
    }

    public void setServiceMotto(String serviceMotto) {
        this.serviceMotto = serviceMotto;
    }
}
