package com.jwcloud.controller.resource;

import com.jwcloud.base.BaseController;
import com.jwcloud.cluster.ClusterDto;
import com.jwcloud.cluster.ClusterEntity;
import com.jwcloud.cluster.ClusterService;
import com.jwcloud.host.HostDto;
import com.jwcloud.host.HostEntity;
import com.jwcloud.host.HostService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "基础配置-集群")
@RestController
@RequestMapping("/v1.0/cluster")
public class ClusterController extends BaseController<ClusterService, ClusterEntity, ClusterDto> {

}
