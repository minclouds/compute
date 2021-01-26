package com.jwcloud.host;

import com.jwcloud.base.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class HostDto extends BaseDto {
    private HostType type;

    private String manageIp;
}
