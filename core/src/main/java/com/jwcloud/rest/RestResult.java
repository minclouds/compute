package com.jwcloud.rest;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class RestResult<T> implements RestMessage {
    /** 返回的状态码 */
    private String status;
    /** 响应消息 */
    private String message;
    /** 响应详细消息 */
    private T data;

    public static <T> RestResult<T> success(T data) {

        return new RestResult<T>().setStatus(RestMessage.SUCCEED).setData(data);
    }

    public static <T> RestResult<T> error(String message, T data) {

        return new RestResult<T>().setStatus(RestMessage.FAILED).setMessage(message);
    }
}
