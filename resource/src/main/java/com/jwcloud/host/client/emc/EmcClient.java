package com.jwcloud.host.client.emc;

import com.jwcloud.host.client.constant.PowerAction;
import com.jwcloud.rest.RestResult;
import org.springframework.stereotype.Service;

@Service
public class EmcClient {

    public RestResult<EmcInfo> create(String requestId, EmcData emcData) {
        return null;
    }


    public RestResult<EmcInfo> delete(String serverId) {
        return null;
    }


    public RestResult<EmcInfo> power(String serverId, PowerAction action) {
        return null;
    }


    public RestResult<EmcInfo> resize(int cpu, int memory) {
        return null;
    }


    public RestResult<EmcInfo> changePassword(String username, String password) {
        return null;
    }


    public RestResult<EmcInfo> migrate() {
        return null;
    }


    public RestResult<EmcInfo> describe(String serverId) {
        return null;
    }


    public RestResult<EmcInfo> list() {
        return null;
    }
}
