/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.proxy;

import cn.hselfweb.webpub.webpubmiddleware.type.CreateDbParam;
import cn.hselfweb.webpub.webpubmiddleware.type.CreateFtpParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteDbParam;
import cn.hselfweb.webpub.webpubmiddleware.utils.StaticData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DBProxy {
    private RestTemplate restTemplate;

    @Autowired
    DBProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> createDb(CreateDbParam createDbParam) {
        String url = StaticData.BASE_URl + "/database?action=AddDatabase";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(createDbParam), String.class);
    }

    public ResponseEntity<String> deleteDb(DeleteDbParam deleteDbParam) {
        String url = StaticData.BASE_URl + "/database?action=DeleteDatabase";
        return restTemplate.exchange(url, HttpMethod.POST, StaticData.Get_Enitity_withBody(deleteDbParam), String.class);
    }

}
