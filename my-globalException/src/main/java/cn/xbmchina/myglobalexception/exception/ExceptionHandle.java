package cn.xbmchina.myglobalexception.exception;

import cn.xbmchina.myglobalexception.common.Result;
import cn.xbmchina.myglobalexception.enums.ResultEnum;
import cn.xbmchina.myglobalexception.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    /**
     *  @ExceptionHandler(value = Exception.class):声明要捕获的异常类
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof CommonException){
            CommonException commonException = (CommonException)e;
            return ResultUtil.error(commonException.getCode(),commonException.getMessage());
        }else {
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR.getCode(),ResultEnum.UNKNOW_ERROR.getMsg());
        }
    }
}