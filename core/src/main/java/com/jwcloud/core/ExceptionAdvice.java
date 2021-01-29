package com.jwcloud.core;

import com.jwcloud.base.BaseException;
import com.jwcloud.rest.RestMessage;
import com.jwcloud.rest.RestResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RestResult exceptionHandler(Exception e) {

        return RestResult.error(RestMessage.FAILED, e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RestResult baseExceptionHandler(BaseException e) {

        return RestResult.error(e.getStatus(), e.getMessage());
    }
}
