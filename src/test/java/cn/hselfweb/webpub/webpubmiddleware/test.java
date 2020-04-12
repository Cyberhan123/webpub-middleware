/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */
package cn.hselfweb.webpub.webpubmiddleware;

import cn.hselfweb.webpub.webpubmiddleware.proxy.SystemProxy;
import cn.hselfweb.webpub.webpubmiddleware.services.SiteService;
import cn.hselfweb.webpub.webpubmiddleware.type.SiteListParam;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class test {

    public void GetSystemTotal() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://127.0.0.1:8888/system?action=GetSystemTotal";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("email", "844072586@qq.com");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        System.out.println(response.getBody());
    }

    @Autowired
    SiteService siteService;

    @Test
    public void testSite() {
        SiteListParam siteListParam = new SiteListParam();
        System.out.print(siteListParam);
        siteListParam.setLimit(15);
        siteService.getList(siteListParam);
    }
}
