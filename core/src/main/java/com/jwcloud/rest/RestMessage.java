package com.jwcloud.rest;

public interface RestMessage<T> {
    String SUCCEED = "Succeed";

    String FAILED = "Failed";

    String getMessage();
}
