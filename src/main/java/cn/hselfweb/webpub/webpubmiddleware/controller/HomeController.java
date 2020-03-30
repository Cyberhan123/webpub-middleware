/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.controller;

import cn.hselfweb.webpub.webpubmiddleware.services.HomeService;
import cn.hselfweb.webpub.webpubmiddleware.type.NavItem;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/v1/api/home")
@ApiModel(value = "首页类", description = "对应前端首页")
public class HomeController {
    private HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping(value = "/navList", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<NavItem> navList() {
        return homeService.setNavList();
    }
}
