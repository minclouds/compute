package com.jwcloud.controller.resource;

import com.jwcloud.base.BaseController;
import com.jwcloud.pod.PodDto;
import com.jwcloud.pod.PodEntity;
import com.jwcloud.pod.PodService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "基础配置-交付")
@RestController
@RequestMapping("/v1.0/pod")
public class PodController extends BaseController<PodService, PodEntity, PodDto> {

}
