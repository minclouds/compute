package com.jwcloud.core;

import lombok.Getter;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public abstract class ExceptionHandler extends RuntimeException {
    @Getter
    protected String status;

    @Getter
    protected String message;

    public ExceptionHandler() {
    }

    public ExceptionHandler(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
