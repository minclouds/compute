package com.jwcloud.base;

import lombok.Getter;

public abstract class BaseException extends RuntimeException {
    @Getter
    protected String status;
    @Getter
    protected String message;

    public BaseException() {
    }

    public BaseException(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
