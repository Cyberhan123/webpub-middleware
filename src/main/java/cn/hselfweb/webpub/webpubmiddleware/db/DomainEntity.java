/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import javax.persistence.*;

@Entity
@Table(name = "domain")
public class DomainEntity {
    private int id;
    private Integer pid;
    private String name;
    private Integer port;
    private String addtime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "port")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Basic
    @Column(name = "addtime")
    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DomainEntity that = (DomainEntity) o;

        if (id != that.id) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
