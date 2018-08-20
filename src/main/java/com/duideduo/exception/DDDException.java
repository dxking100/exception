package com.duideduo.exception;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class DDDException {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String ttdException(HttpServletRequest request, Exception ex){
        // 开启日志记录
        String errorInfo = ex.getClass()+":"+ex.getMessage()+":"+ex.getCause();
        logger.error(errorInfo,ex);
        ResultMsg res = new ResultMsg(ResultMsg.Code.Error,null,ex.getMessage());
        return JSON.toJSONString(res);
    }

}
