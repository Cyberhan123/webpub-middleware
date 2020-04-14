/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.services;

import cn.hselfweb.webpub.webpubmiddleware.type.NavItem;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/**
 * 主页业务层
 */
@Service
public class HomeService {
    /**
     * 设置导航栏内容
     *
     * @return
     */
    public ArrayList<NavItem> setNavList() {
        NavItem home = new NavItem("首页", "/");
        NavItem site = new NavItem("网站", "/website");
        NavItem ftp = new NavItem("FTP", "/ftp");
        NavItem db = new NavItem("数据库", "/db/");
        NavItem watch = new NavItem("监控", "/watch");
        NavItem safe = new NavItem("安全", "/safe");
        NavItem plan = new NavItem("计划任务", "/plan");
        ArrayList<NavItem> navItems = Lists.newArrayList(home, site, ftp, db, watch, safe, plan);
        return navItems;
    }
}
