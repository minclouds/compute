package com.jwcloud.host.client.kvm;

import com.jwcloud.rest.RestResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({"Content-Type: application/json; charset=utf-8",
        "CallbackUrl: {callbackUrl}",
        "RequestId: {requestId}"})
public interface KvmApi {

    @RequestLine("POST /vm/create")
    RestResult<KvmInfo> create(@Param("requestId") String requestId, @Param("callbackUrl") String callbackUrl, KvmData params);
}
