/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */
package cn.hselfweb.webpub.webpubmiddleware.security;

import org.minbox.framework.api.boot.plugin.security.delegate.ApiBootStoreDelegate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 自定义用户安全协议 JWT接受与转发
 */
@Component
public class CustomUserStoreDelegate implements ApiBootStoreDelegate {
    /**
     * 返回根据username查询的用户详情对象
     * UserDetails是SpringSecurity提供的用户详情接口
     * 返回的自定义用户对象需实现UserDetails接口
     * @param username 用户名
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
