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
public class DeleteSiteParam {
    private Integer id; //网站 ID[必传]
    private String webname; //网站名称 [必传]
    private String ftp; //是否删除关联 FTP ，如果不删除请不要传此参数[可选]
    private String database; //是否删除关联数据库，如果不删除请不要传此参数[可选]
    private String path; //是否删除网站根目录，如果不删除请不要传此参数[可选]
}
