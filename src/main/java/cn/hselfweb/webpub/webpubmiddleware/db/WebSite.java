/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import lombok.Data;

import javax.persistence.*;

/**
 * 数据库网站表双向映射
 */
@Entity
@Data
@Table(name = "web_site")
public class WebSite {
    @Id
    @Column(name = "website_id")
    private Long wid;

    //网站状态 1开启 0关闭
    @Column(name = "status")
    private String status;

    //网站备注
    @Column(name = "ps")
    private String ps;

    //网站域名等级 1 一级域名 2 二级域名
    @Column(name = "domain")
    private String domain;

    //名字
    @Column(name = "name")
    private String name;

    //创建时间
    @Column(name = "add_time")
    private String addTime;

    //在服务器实体路径
    @Column(name = "path")
    private String path;

    //回滚次数统计
    @Column(name = "backup_count")
    private String backupCount;
}
