package com.jwcloud.controller.resource;

import com.jwcloud.base.BaseController;
import com.jwcloud.host.HostDto;
import com.jwcloud.host.HostEntity;
import com.jwcloud.host.HostService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"基础资源-主机"})
@RestController
@RequestMapping("/v1.0/host")
public class HostController extends BaseController<HostService, HostEntity, HostDto> {

}
