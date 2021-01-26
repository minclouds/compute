package com.jwcloud.host.client.kvm;

import com.jwcloud.host.client.constant.PowerAction;
import com.jwcloud.rest.RestResult;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("kvm")
public class KvmClient {
    
    public RestResult<KvmInfo> create(String requestId, KvmData kvmData) {
        return null;
    }

    
    public RestResult<KvmInfo> delete(String serverId) {
        return null;
    }

    
    public RestResult<KvmInfo> power(String serverId, PowerAction action) {
        return null;
    }

    
    public RestResult<KvmInfo> resize(int cpu, int memory) {
        return null;
    }

    
    public RestResult<KvmInfo> changePassword(String username, String password) {
        return null;
    }

    
    public RestResult<KvmInfo> migrate() {
        return null;
    }

    
    public RestResult<KvmInfo> describe(String serverId) {
        return null;
    }

    
    public RestResult<KvmInfo> list() {
        return null;
    }
}
