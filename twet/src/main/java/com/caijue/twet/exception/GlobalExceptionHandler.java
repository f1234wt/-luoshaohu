package com.caijue.twet.exception;


import com.caijue.twet.common.ApiRestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * 统一处理异常的(拦截和过滤器)
 */
@ControllerAdvice//controller的升级版和@ExceptionHandler（异常的类型）搭配使用（当controller里发生异常时拦截进入到对应的方法）
public class GlobalExceptionHandler {
    //日志
    private final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e){
        //发生其他异常也就是系统异常时（默认异常）
        log.error("Default Exception: ",e);
        return ApiRestResponse.error(MallExceptionEnum.SYSTEM_ERROR);
    }

    @ExceptionHandler(MallException.class)
    @ResponseBody
    public Object handleMallException(MallException e){
        //发生自定义异常时
        log.error("MallException: ",e);
        return ApiRestResponse.error(e.getCode(),e.getMassage());
    }
    //拦截方法参数没有通过校验的异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ApiRestResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        //打印错误日志呢
        log.error("MethodArgumentNotValidException:",e);
        //调用对应的方法，并将错误的结果集放入其中
        return handleBindingResult(e.getBindingResult());
    }

  private ApiRestResponse handleBindingResult(BindingResult result) {
      //把异常处理为对外暴露的提示
      List<String> list = new ArrayList<String>();
      //如果结果里有异常（循环遍历放入自定义的异常集合中方便后续提示输出）
      if (result.hasErrors()) {
          List<ObjectError> allErrors = result.getAllErrors();
          for (ObjectError objectError : allErrors) {
              //拿到对应错误的提示信息，并放入自定义的list中
              String message = objectError.getDefaultMessage();
              list.add(message);
          }
      }
      if(list.size()==0){//有异常，但不是我们已经定义好的异常，统一提示参数错误
            return ApiRestResponse.error(MallExceptionEnum.REQUEST_PARAM_ERROR);
      }
      //有我们自定义的异常，拿到参数错误的code错误代码，提示信息是我们自定义的信息
      return ApiRestResponse.error(MallExceptionEnum.REQUEST_PARAM_ERROR.getCode(),list.toString());
  }

}