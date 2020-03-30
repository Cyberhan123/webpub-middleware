/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.type;

/**
 * 通用数据传输
 */
public class CommonForm {
    //当前分页 [可选]
    public String p;
    //取回的数据行数 [必传]
    public String limit;
    //分类标识,-1: 分部分类 0: 默认分类 [可选]
    public String type;
    //排序规则 使用 id 降序：iddesc 使用名称升序：namedesc[可选]
    public String order;
    //回调
    public String tojs;
    //搜索内容 [可选]
    public String search;
}
