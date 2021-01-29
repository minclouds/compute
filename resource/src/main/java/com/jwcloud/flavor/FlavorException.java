package com.jwcloud.flavor;

import com.jwcloud.base.BaseException;

public class FlavorException extends BaseException {

    public FlavorException(FlavorMessage message, Object... args) {
        this.status = message.name();
        this.message = String.format(message.getMessage(), args);
    }
}
