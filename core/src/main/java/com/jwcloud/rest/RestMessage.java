package com.jwcloud.rest;

import lombok.Getter;

public interface RestMessage<T> {
    String SUCCEED = "Succeed";

    String FAILED = "Failed";

    String getMessage();
}
