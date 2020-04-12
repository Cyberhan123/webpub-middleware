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
public class SiteListParam {
 //   SiteListParam() {
//        this.page = 1;
//        this.limit = 15;
//        this.type = -1;
//        this.order = "";
//  }

    private int page;   //当前分页 [可选]
    private int limit; // 取回的数据行数 [必传]
    private int type; //分类标识,-1: 分部分类 0: 默认分类 [可选]
    private String order; //排序规则 使用 id 降序：iddesc 使用名称升序：namedesc[可选]
    private String tojs; //分页 JS 回调,若不传则构造 URI 分页连接 [可选]
    private String search; //搜索内容 [可选]
}
