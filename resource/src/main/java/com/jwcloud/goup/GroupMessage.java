package com.jwcloud.goup;

import com.jwcloud.rest.RestMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum GroupMessage implements RestMessage {
    NotFound("Group[%s] not found!"),
    ;

    @Getter
    private String message;

}
