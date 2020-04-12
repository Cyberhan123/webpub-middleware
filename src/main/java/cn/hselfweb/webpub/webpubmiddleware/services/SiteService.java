/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.services;

import cn.hselfweb.webpub.webpubmiddleware.proxy.SiteProxy;
import cn.hselfweb.webpub.webpubmiddleware.type.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * 网站业务层
 */
@Service
public class SiteService {

    private SiteProxy siteProxy;

    @Autowired
    SiteService(SiteProxy siteProxy) {
        this.siteProxy = siteProxy;
    }

    //创建网站
    public ResponseEntity<String> addSite(CreateSiteParam createSiteParam) {
        return this.siteProxy.addSite(createSiteParam);
    }

    //删除网站
    public ResponseEntity<String> deleteSite(DeleteSiteParam deleteSiteParam) {
        return this.siteProxy.deleteWebSite(deleteSiteParam);
    }

    //获取网站列表
    public ResponseEntity<String> getList(SiteListParam siteListParam) {
        return this.siteProxy.getWebSiteList(siteListParam);
    }

    //启动网站
    public ResponseEntity<String> startSite(SiteStatusParam siteStatusParam) {
        return this.siteProxy.startWebSite(siteStatusParam);
    }

    //停用网站
    public ResponseEntity<String> stopSite(SiteStatusParam siteStatusParam) {
        return this.siteProxy.stopWebSite(siteStatusParam);
    }

    //修改网站备注
    public ResponseEntity<String> editSiteDesc(SiteDescParam siteDescParam) {
        return this.siteProxy.editWebSiteDesc(siteDescParam);
    }

    //网站备份列表
    public ResponseEntity<String> listSiteBackup(CommonForm commonForm) {
        return this.siteProxy.getWebSiteBackup(commonForm);
    }

    //创建网站备份
    public ResponseEntity<String> createSiteBackup(Integer id) {
        return this.siteProxy.createWebSiteBackup(id);
    }

    //删除网站备份
    public ResponseEntity<String> deleteSiteBackup(Integer id) {
        return this.siteProxy.deleteWebSiteBackup(id);
    }

}
