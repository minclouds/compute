package com.jwcloud.host;

import com.jwcloud.rest.RestMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 宿主机异常信息返回结果
 */
@AllArgsConstructor
public enum HostMessage implements RestMessage {
    NotFound("Host[%s] not found!"),
    ;

    @Getter
    public String message;
}
