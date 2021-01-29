package com.jwcloud.server;

import com.jwcloud.constant.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerService implements Constant {
    @Autowired
    private ServerMapper serverMapper;
}
