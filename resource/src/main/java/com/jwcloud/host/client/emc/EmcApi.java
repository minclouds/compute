package com.jwcloud.host.client.emc;

import feign.Headers;
import feign.RequestLine;

@Headers({"Content-Type: application/json; charset=utf-8"})
public interface EmcApi {

    @RequestLine("POST /emc/disk/create")
    EmcResult create(EmcData params);
}
