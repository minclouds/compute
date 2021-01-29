package com.jwcloud.controller.instance;

import com.jwcloud.controller.contant.BmsAction;
import com.jwcloud.controller.contant.EbsAction;
import com.jwcloud.controller.contant.EcsAction;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "实例管理-操作")
@RestController
@RequestMapping("/v1.0")
public class OperateController {

    @ApiOperation(value = "弹性云服务器操作", notes = "弹性云主机属性、操作系统、电源变更。")
    @PostMapping("/compute/ecs/{action}")
    public void operateEcs(@PathVariable EcsAction action) {
    }

    @ApiOperation(value = "裸金属服务器操作", notes = "裸金属服务器属性、操作系统、电源、位置变更。")
    @PostMapping("/compute/bms/{action}")
    public void operateBms(@PathVariable BmsAction action) {
    }

    @ApiOperation(value = "弹性云硬盘操作", notes = "弹性云硬盘属性、限速、容量变更。")
    @PostMapping("/storage/ebs/{action}")
    public void operateEbs(@PathVariable EbsAction action) {
    }
}
