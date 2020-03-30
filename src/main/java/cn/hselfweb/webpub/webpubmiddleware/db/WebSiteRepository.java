/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 数据库WebSite表查询接口暴露
 */
public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
