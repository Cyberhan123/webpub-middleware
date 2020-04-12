/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.controller;

import cn.hselfweb.webpub.webpubmiddleware.services.SiteService;
import cn.hselfweb.webpub.webpubmiddleware.type.*;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/v1/api/site")
@ApiModel(value = "网站类", description = "对应前端网站")
public class WebSiteController {
    private SiteService siteService;

    @Autowired
    public WebSiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    /**
     * 网站列表
     * @param
     * @return R
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> getSiteList() {
        SiteListParam siteListParam = new SiteListParam();
        return this.siteService.getList(siteListParam);
    }

    /**
     * 创建网站
     * @param createSiteParam 网站请求参数
     * @return R
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> createSite(CreateSiteParam createSiteParam) {
        return this.siteService.addSite(createSiteParam);
    }

    /**
     * 删除网站
     * @param deleteSiteParam 删除网站请求参数
     * @return R
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> deleteSite(DeleteSiteParam deleteSiteParam) {
        return this.siteService.deleteSite(deleteSiteParam);
    }

    /**
     * 启动网站
     * @param siteStatusParam
     * @return
     */
    @RequestMapping(value = "/start", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> startSite(SiteStatusParam siteStatusParam) {
        return this.siteService.startSite(siteStatusParam);
    }

    /**
     * 停用网站
     * @param siteStatusParam
     * @return
     */
    @RequestMapping(value = "/stop", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> stopSite(SiteStatusParam siteStatusParam) {
        return this.siteService.stopSite(siteStatusParam);
    }

    /**
     * 获取网站备份列表
     * @param siteDescParam
     * @return
     */
    @RequestMapping(value = "/desc", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> editSiteDesc(SiteDescParam siteDescParam) {
        return this.siteService.editSiteDesc(siteDescParam);
    }

    /**
     * 获取网站备份列表
     * @param commonForm
     * @return
     */
    @RequestMapping(value = "/backup/list", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> listSiteBackup(CommonForm commonForm) {
        return this.siteService.listSiteBackup(commonForm);
    }


    /**
     * 创建网站备份
     * @param id
     * @return
     */
    @RequestMapping(value = "/backup/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> createSiteBackup(Integer id) {
        return this.siteService.createSiteBackup(id);
    }

    /**
     * 删除网站备份
     * @param id
     * @return
     */
    @RequestMapping(value = "/backup/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> deleteSiteBackup(Integer id) {
        return this.siteService.deleteSiteBackup(id);
    }


}
