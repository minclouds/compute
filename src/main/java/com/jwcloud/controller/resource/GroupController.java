package com.jwcloud.controller.resource;

import com.jwcloud.base.BaseController;
import com.jwcloud.flavor.FlavorDto;
import com.jwcloud.flavor.FlavorEntity;
import com.jwcloud.flavor.FlavorService;
import com.jwcloud.goup.GroupDto;
import com.jwcloud.goup.GroupEntity;
import com.jwcloud.goup.GroupService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "基础配置-分组")
@RestController
@RequestMapping("/v1.0/group")
public class GroupController extends BaseController<GroupService, GroupEntity, GroupDto> {

}
