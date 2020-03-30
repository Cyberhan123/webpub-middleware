/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 数据库用户表双向映射
 */
@Entity
@Data
@Table(name = "user")
public class User {
    /**
     * PASSWORD_ENCODER 是在比较之前加密新密码或接受密码输入并加密它们的方法。
     * id，name，password，和roles定义来限制访问所需的参数。
     * 自定义setPassword()确保密码永远不会以明文形式存储。
     */
    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    /**
     * @ToString(exclude = "password") 确保Lombok生成的toString（）方法不会打印出密码。
     * @JsonIgnore 应用于密码字段保护json序列化该字段。
     */
    @Column(name = "password")
    private /*@JsonIgnore*/ String password;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "tel")
    private String tel;

    @Column(name = "info")
    private String info;

    @Column(name = "head_url")
    private String headUrl;
}
