/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.controller;

import cn.hselfweb.webpub.webpubmiddleware.proxy.FtpProxy;
import cn.hselfweb.webpub.webpubmiddleware.services.FTPService;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateFtpParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteFtpParam;
import cn.hselfweb.webpub.webpubmiddleware.type.SiteListParam;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/ftp")
@ApiModel(value = "ftp类", description = "对应前端ftp")
public class FTPController {

    private FTPService ftpService;

    @Autowired
    FTPController(FTPService ftpService) {
        this.ftpService = ftpService;
    }

    /**
     * 创建Ftp账户
     *
     * @param createFtpParam 参数
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> createFtp(CreateFtpParam createFtpParam) {
        return this.ftpService.createFtp(createFtpParam);
    }

    /**
     * 删除Ftp
     *
     * @param createFtpParam
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> deleteFtp(DeleteFtpParam createFtpParam) {
        return this.ftpService.deleteFtp(createFtpParam);
    }

}
