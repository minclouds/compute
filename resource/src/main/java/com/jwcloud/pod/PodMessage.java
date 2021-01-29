package com.jwcloud.pod;

import com.jwcloud.rest.RestMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PodMessage implements RestMessage {
    NotAllowed("Pod[%s] has host not allowed to be deleted!"),
    NotFound("Pod[%s] not found!"),
    ;

    @Getter
    private String message;

}
