/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

import lombok.Data;

@Data
public class SiteStatusParam {
    private int id;//网站 ID [必传]
    private String name;//网站名称(主域名)[必传]
}
