package com.jwcloud.pod;

import com.jwcloud.base.BaseException;

public class PodException extends BaseException {

    public PodException(PodMessage message, Object... args) {
        this.status = message.name();
        this.message = String.format(message.getMessage(), args);
    }
}
