/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.proxy;

import cn.hselfweb.webpub.webpubmiddleware.type.*;
import cn.hselfweb.webpub.webpubmiddleware.utils.StaticData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 超速中间件
 * 转发 pyhton 生成的SiteProxy端口
 */
@Service
public class SiteProxy {
    private RestTemplate restTemplate;

    @Autowired
    public SiteProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // 创建网站
    public ResponseEntity<String> addSite(CreateSiteParam createSiteParam) {
        String url = StaticData.BASE_URl + "/site?action=AddSite";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(createSiteParam), String.class);
    }

    // 获取网站列表
    public ResponseEntity<String> getWebSiteList(SiteListParam siteListParam) {
        String url = StaticData.BASE_URl + "/data?action=getData&table=sites";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteListParam), String.class);
    }

    // 获取网站分类
    public ResponseEntity<String> getWebSiteType(SiteInfo siteInfo) {
        String url = StaticData.BASE_URl + "/site?action=get_site_types";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteInfo), String.class);
    }

    // 删除网站
    public ResponseEntity<String> deleteWebSite(DeleteSiteParam deleteSiteParam) {
        String url = StaticData.BASE_URl + "/site?action=DeleteSite";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(deleteSiteParam), String.class);
    }

    // 暂停网站
    public ResponseEntity<String> stopWebSite(SiteStatusParam siteStatusParam) {
        String url = StaticData.BASE_URl + "/site?action=SiteStop";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteStatusParam), String.class);
    }

    // 启用网站
    public ResponseEntity<String> startWebSite(SiteStatusParam siteStatusParam) {
        String url = StaticData.BASE_URl + "/site?action=SiteStart";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteStatusParam), String.class);
    }

    //修改网站备注
    public ResponseEntity<String> editWebSiteDesc(SiteDescParam siteDescParam) {
        String url = StaticData.BASE_URl + "/data?action=setPs&table=sites";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteDescParam), String.class);
    }

    //获取网站备份列表
    public ResponseEntity<String> getWebSiteBackup(CommonForm commonForm) {
        String url = StaticData.BASE_URl + "/data?action=getData&table=backup ";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(commonForm), String.class);
    }

    //创建网站备份
    public ResponseEntity<String> createWebSiteBackup(Integer id) {
        String url = StaticData.BASE_URl + "/site?action=ToBackup";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(id), String.class);
    }

    //删除网站备份
    public ResponseEntity<String> deleteWebSiteBackup(Integer id) {
        String url = StaticData.BASE_URl + "/site?action=DelBackup";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(id), String.class);
    }

    //添加域名
    public ResponseEntity<String> addWebSiteDomain(SiteInfo siteInfo) {
        String url = StaticData.BASE_URl + "/site?action=AddDomain";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteInfo), String.class);
    }

    //删除域名
    public ResponseEntity<String> deleteWebSiteDomain(SiteInfo siteInfo) {
        String url = StaticData.BASE_URl + "/site?action=DelDomain";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteInfo), String.class);
    }

    //修改网站根目录
    public ResponseEntity<String> setWebSiteRootPath(SiteInfo siteInfo) {
        String url = StaticData.BASE_URl + "/site?action=SetPath";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(siteInfo), String.class);
    }

}
