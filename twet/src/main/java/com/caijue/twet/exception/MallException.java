package com.caijue.twet.exception;

/**
 * 统一异常
 */
public class MallException extends RuntimeException{
    /**
     * 异常代码
     */
    private final Integer code;
    /**
     * 异常的错误信息
     */
    private final String massage;

    public MallException(Integer code,String massage){
        this.code=code;
        this.massage=massage;
    }
    public MallException(MallExceptionEnum ex){
        this(ex.getCode(),ex.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public String getMassage() {
        return massage;
    }
}
