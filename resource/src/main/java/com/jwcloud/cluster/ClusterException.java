package com.jwcloud.cluster;

import com.jwcloud.base.BaseException;

public class ClusterException extends BaseException {

    public ClusterException(ClusterMessage message, Object... args) {
        this.status = message.name();
        this.message = String.format(message.getMessage(), args);
    }
}
