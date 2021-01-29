package com.jwcloud.goup;

import com.jwcloud.base.BaseException;

public class GroupException extends BaseException {

    public GroupException(GroupMessage message, Object... args) {
        this.status = message.name();
        this.message = String.format(message.getMessage(), args);
    }
}
