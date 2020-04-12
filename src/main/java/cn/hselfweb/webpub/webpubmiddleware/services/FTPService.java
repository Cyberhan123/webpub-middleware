/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.services;

import cn.hselfweb.webpub.webpubmiddleware.proxy.FtpProxy;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateFtpParam;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateSiteParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteFtpParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * FTP控制业务层
 */
@Service
public class FTPService {
    private FtpProxy ftpProxy;

    @Autowired
    FTPService(FtpProxy ftpProxy) {
        this.ftpProxy = ftpProxy;
    }

    //创建Ftp
    public ResponseEntity<String> createFtp(CreateFtpParam createFtpParam) {
        return this.ftpProxy.createFtp(createFtpParam);
    }

    //删除Ftp
    public ResponseEntity<String> deleteFtp(DeleteFtpParam deleteFtpParam) {
        return this.ftpProxy.deleteFtp(deleteFtpParam);
    }

}
