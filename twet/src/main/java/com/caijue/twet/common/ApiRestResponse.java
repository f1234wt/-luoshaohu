package com.caijue.twet.common;

import com.caijue.twet.exception.MallExceptionEnum;

/**
 * 通用的返回对象
 * @param <T>
 */
public class ApiRestResponse<T> {
    /**
     * //错误代码
     */
    private Integer status;
    /**
     * //错误信息提示
     */
    private String msg;
    /**
     * //返回值类型（泛型）
     */
    private T data;

    //定义两个常量（正确时的代码和信息提示）
    private static final int OK_CODE=10000;
    private static final String OK_MSG="SUCCESS";//正确的

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    //有参构造方法（三个参数需要给前端页面返回数据）
    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    //有参构造方法（两个参数，不需要给前端页面返回数据）
    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    //无参构造（直接默认正确的错误码和提示信息）
    public ApiRestResponse() {
        this(OK_CODE,OK_MSG);
    }

    //定义静态方法当结果为正确时（分为两种情况，携带参数和不携带参数）返回值都为通用类型（本类）
    public static <T> ApiRestResponse<T> success(){
        //不携带参数
        return new ApiRestResponse<>();
    }
    public static <T> ApiRestResponse<T> success(T result){
        ApiRestResponse<T> response = new ApiRestResponse<>();
        response.setData(result);
        return response;
    }
    //定义静态方法当结果为错误时（分为两种情况，已知异常（枚举类）和未知异常（自定义））返回值都为通用类型（本类）
    public static <T> ApiRestResponse<T> error(Integer code, String msg){
        return new ApiRestResponse<>(code,msg);
    }
    public static <T> ApiRestResponse<T> error(MallExceptionEnum ex){
        return new ApiRestResponse<>(ex.getCode(), ex.getMsg());
    }
}
