/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

import lombok.Data;

@Data
public class CreateDbParam {
    private String name; //用户名
    private String codeing; //utf8
    private String db_user; //数据库名
    private String password; //密码
    private String dtype; //数据库类型 MySQL
    private String dataAccess; //127.0.0.1
    private String address; //127.0.0.1
    private String ps; //备注
}
