/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */
package cn.hselfweb.webpub.webpubmiddleware.proxy;

import cn.hselfweb.webpub.webpubmiddleware.utils.StaticData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 超速中间件
 * 转发 pyhton 生成的SystemProxy端口
 */

@Service
public class SystemProxy {
    private RestTemplate restTemplate;

    @Autowired
    public SystemProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> GetSystemTotal() {
        String url = StaticData.BASE_URl + "/system?action=GetSystemTotal";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Entity(), String.class);
    }
}
