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

    /**
     * 获取正确的结果并返回
     */
    public static <T> RestResult<T> success(T data) {

        return new RestResult<T>().setStatus(RestMessage.SUCCEED).setData(data);
    }

    /**
     * 根据错误码返回不同的错误信息
     */
    public static RestResult error(String status, String message) {

        return new RestResult().setStatus(status).setMessage(message);
    }
}
