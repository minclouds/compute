package com.jwcloud.host;

import com.jwcloud.rest.RestMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum HostMessage implements RestMessage {
    NotFound("Host[%s] not found!"),
    ;

    @Getter
    private String message;

}
