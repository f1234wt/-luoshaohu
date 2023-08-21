package com.caijue.twet.vo;

/**
 * 前端简易列表的返回对象
 */
public class InfoListVo {
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
     * 特卫年龄
     */
    private Long tAge;

    /**
     * 特卫身高（单位/cm）
     */
    private Long tHeight;

    /**
     * 手机号
     */
    private String tPhone;
    /**
     * 特卫等级
     */
    private String garde;
    /**
     * 接单状态（默认未0：未接单。1：已接单）
     */
    private Integer receive;

    public Long getId() {
        return tid;
    }

    public void setId(Long id) {
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

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }

    public String getGarde() {
        return garde;
    }

    public void setGarde(String garde) {
        this.garde = garde;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }
}
