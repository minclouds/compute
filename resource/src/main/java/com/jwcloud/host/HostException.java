package com.jwcloud.host;

import com.jwcloud.base.BaseException;
import com.jwcloud.goup.GroupMessage;

public class HostException extends BaseException {

    public HostException(HostMessage message, Object... args) {
        this.status = message.name();
        this.message = String.format(message.getMessage(), args);
    }
}
