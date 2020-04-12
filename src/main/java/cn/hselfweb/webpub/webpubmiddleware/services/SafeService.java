/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.services;

import cn.hselfweb.webpub.webpubmiddleware.proxy.FireWallProxy;
import cn.hselfweb.webpub.webpubmiddleware.type.AddAccessPortParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * 安全业务层
 */
@Service
public class SafeService {
    private FireWallProxy fireWallProxy;

    @Autowired
    SafeService(FireWallProxy fireWallProxy) {
        this.fireWallProxy = fireWallProxy;
    }

    public ResponseEntity<String> addAccessPort(AddAccessPortParam addAccessPortParam) {
        return this.fireWallProxy.addAccessPort(addAccessPortParam);
    }

    public ResponseEntity<String> getSshInfo() {
        return this.fireWallProxy.getSshInfo();
    }

    public ResponseEntity<String> setSshPort(String port) {
        return this.fireWallProxy.setSshPort(port);
    }

}
