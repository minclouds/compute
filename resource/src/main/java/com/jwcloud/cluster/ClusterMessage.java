package com.jwcloud.cluster;

import com.jwcloud.rest.RestMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ClusterMessage implements RestMessage {
    NotAllowed("Cluster[%s] has pod not allowed to be deleted!"),
    NotFound("Cluster[%s] not found!"),
    ;

    @Getter
    private String message;

}
