/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.controller;

import cn.hselfweb.webpub.webpubmiddleware.proxy.SystemProxy;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/watch")
@ApiModel(value="监视类",description="对应前端监视" )
public class WatchController {
    private SystemProxy systemProxy;

    @Autowired
    public WatchController(SystemProxy systemProxy) {
        this.systemProxy = systemProxy;
    }

    /**
     * 系统监控统计
     * @return R
     */
    @RequestMapping(value = "/total", method = RequestMethod.GET)
    public @ResponseBody String total() {
        return null;
    }
}
