package com.jwcloud.flavor;

import com.jwcloud.rest.RestMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FlavorMessage implements RestMessage {
    NotFound("Flavor[%s] not found!"),
    ;

    @Getter
    private String message;

}
