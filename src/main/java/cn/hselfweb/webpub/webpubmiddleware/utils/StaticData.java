/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */
package cn.hselfweb.webpub.webpubmiddleware.utils;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * 静态数据配置
 */
public class StaticData {
    //代理转发基本URl
    public static String BASE_URl = "http://127.0.0.1:8888";

    //基本Http请求头

    @NotNull
    public static HttpEntity<String> Get_Entity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<String>(headers);
    }
    //带有body的

    @NotNull
    @Contract("_ -> new")
    public static <T> HttpEntity<T> Get_Enitity_withBody(T t) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<T>(t, headers);
    }

}
