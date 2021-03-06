package com.jwcloud.controller.instance;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "实例管理-交付")
@RestController
@RequestMapping("/v1.0/delivery")
public class DeliveryController {
    @ApiOperation(value = "交付", notes = "根据交付单内容交付指定类型的资源或资源组合。")
    @PostMapping
    public void operate(@PathVariable String serviceType,
                        @PathVariable String InstanceType,
                        @PathVariable String action) {
    }
}
