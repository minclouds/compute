package com.jwcloud.host.client;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class FeignClient {
    protected String callbackUri;

    public <T> T getClient(Class<T> clazz, String url) {

        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}
