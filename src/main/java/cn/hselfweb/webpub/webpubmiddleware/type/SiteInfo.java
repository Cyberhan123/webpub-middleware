/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

import lombok.Data;

@Data
public class SiteInfo {
    //网站主域名和域名列表
    public String webname;
    //根目录 [必传]
    public String path;
    //分类标识 [必传]
    public String type_id;
    //项目类型 请传 PHP[必传]
    public String type;
    //PHP 版本 请从 PHP 版本列表中选择 [必传]
    public String version;
    //网站端口 [必传]
    public String port;
    //网站备注 [必传]
    public String ps;
    //是否创建 FTP[必传]  true|false
    public String ftp;
    //FTP 用户名 在要创建 FTP 时必传
    public String ftp_username;
    //FTP 密码 在要创建 FTP 时必传
    public String ftp_password;
    //是否创建数据库[必传]
    public String sql;
    //数据库字符集 在要创建数据库时必传
    public String codeing;
    //数据库用户名及名称 在要创建数据库时必传
    public String datauser;
    //数据库密码 在要创建数据库时必传
    public String datapassword;

    public SiteInfo(String webname, String path, String type_id, String type, String version, String port, String ps, String ftp, String ftp_username, String ftp_password, String sql, String codeing, String datauser, String datapassword) {
        this.webname = webname;
        this.path = path;
        this.type_id = type_id;
        this.type = type;
        this.version = version;
        this.port = port;
        this.ps = ps;
        this.ftp = ftp;
        this.ftp_username = ftp_username;
        this.ftp_password = ftp_password;
        this.sql = sql;
        this.codeing = codeing;
        this.datauser = datauser;
        this.datapassword = datapassword;
    }
}
