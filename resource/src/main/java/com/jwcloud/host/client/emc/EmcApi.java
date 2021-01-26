package com.jwcloud.host.client.emc;

import com.jwcloud.rest.RestResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({"Content-Type: application/json; charset=utf-8"})
public interface EmcApi {

    @RequestLine("POST /emc/disk/create")
    EmcResult create(EmcData params);
}
