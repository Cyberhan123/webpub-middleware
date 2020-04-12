/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CreateSiteParam {
    private String webname; // 网站主域名和域名列表 请传 JSON[必传]
    private String path; // 根目录 [必传]
    private int type_id; // 分类标识 [必传]
    private String type; // 项目类型 请传 PHP[必传]
    private String version; // PHP 版本 请从 PHP 版本列表中选择 [必传]
    private int port; // 网站端口 [必传]
    private String ps; // 网站备注 [必传]
    private boolean ftp; // 是否创建 FTP[必传]
    private String ftp_username; //FTP 用户名 在要创建 FTP 时必传
    private String ftp_password; // FTP 密码 在要创建 FTP 时必传
    private boolean sql; //是否创建数据库[必传]
    private String codeing; //数据库字符集 在要创建数据库时必传
}
