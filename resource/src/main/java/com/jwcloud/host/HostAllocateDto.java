package com.jwcloud.host;

import lombok.Data;

import java.util.List;

@Data
public class HostAllocateDto {
    /* 主机白名单 */
    private List<String> whiteHosts;
    /* 主机黑名单 */
    private List<String> blackHosts;
    /* 规格 */
    private String flavorId;
}
