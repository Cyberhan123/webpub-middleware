/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.controller;

import cn.hselfweb.webpub.webpubmiddleware.services.DBService;
import cn.hselfweb.webpub.webpubmiddleware.services.FTPService;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateDbParam;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateFtpParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteDbParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteFtpParam;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/db")
@ApiModel(value = "数据库类", description = "对应前端数据库")
public class DBController {

    private DBService dbService;

    @Autowired
    DBController(DBService dbService) {
        this.dbService = dbService;
    }

    /**
     * 创建Db
     *
     * @param createDbParam 参数
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> createDb(CreateDbParam createDbParam) {
        return this.dbService.createDb(createDbParam);
    }

    /**
     * 删除db
     *
     * @param deleteDbParam
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> deleteFtp(DeleteDbParam deleteDbParam) {
        return this.dbService.deleteDb(deleteDbParam);
    }

}
