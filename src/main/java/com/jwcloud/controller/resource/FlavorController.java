package com.jwcloud.controller.resource;

import com.jwcloud.base.BaseController;
import com.jwcloud.flavor.EcsFlavorDto;
import com.jwcloud.flavor.FlavorEntity;
import com.jwcloud.flavor.FlavorService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "基础配置-规格")
@RestController
@RequestMapping("/v1.0/flavor")
public class FlavorController extends BaseController<FlavorService, FlavorEntity, EcsFlavorDto> {

}
