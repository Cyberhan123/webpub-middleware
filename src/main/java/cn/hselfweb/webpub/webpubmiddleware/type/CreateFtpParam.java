/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

import lombok.Data;


@Data
public class CreateFtpParam {

    private String ftp_username; //ftp用户名【必填】
    private String ftp_password; //ftp密码 【必填】
    private String path;//ftp 路径【必填】
    private String ps;//对当前ftp用户描述【可选】
}
