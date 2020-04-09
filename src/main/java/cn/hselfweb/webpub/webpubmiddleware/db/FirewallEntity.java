/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import javax.persistence.*;

@Entity
@Table(name = "firewall")
public class FirewallEntity {
    private int id;
    private String port;
    private String ps;
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
    @Column(name = "port")
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Basic
    @Column(name = "ps")
    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
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

        FirewallEntity that = (FirewallEntity) o;

        if (id != that.id) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (ps != null ? !ps.equals(that.ps) : that.ps != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (ps != null ? ps.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
