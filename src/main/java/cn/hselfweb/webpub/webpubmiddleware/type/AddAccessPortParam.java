/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

import lombok.Data;

@Data
public class AddAccessPortParam {
    private String port; //端口或者ip地址
    private String type; //port 放行端口 address 屏蔽ip
    private String ps;//备注
}
