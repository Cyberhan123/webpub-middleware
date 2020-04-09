/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import javax.persistence.*;

@Entity
@Table(name = "crontab")
public class CrontabEntity {
    private int id;
    private String name;
    private String type;
    private String where1;
    private Integer whereHour;
    private Integer whereMinute;
    private String echo;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "where1")
    public String getWhere1() {
        return where1;
    }

    public void setWhere1(String where1) {
        this.where1 = where1;
    }

    @Basic
    @Column(name = "where_hour")
    public Integer getWhereHour() {
        return whereHour;
    }

    public void setWhereHour(Integer whereHour) {
        this.whereHour = whereHour;
    }

    @Basic
    @Column(name = "where_minute")
    public Integer getWhereMinute() {
        return whereMinute;
    }

    public void setWhereMinute(Integer whereMinute) {
        this.whereMinute = whereMinute;
    }

    @Basic
    @Column(name = "echo")
    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
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

        CrontabEntity that = (CrontabEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (where1 != null ? !where1.equals(that.where1) : that.where1 != null) return false;
        if (whereHour != null ? !whereHour.equals(that.whereHour) : that.whereHour != null) return false;
        if (whereMinute != null ? !whereMinute.equals(that.whereMinute) : that.whereMinute != null) return false;
        if (echo != null ? !echo.equals(that.echo) : that.echo != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (where1 != null ? where1.hashCode() : 0);
        result = 31 * result + (whereHour != null ? whereHour.hashCode() : 0);
        result = 31 * result + (whereMinute != null ? whereMinute.hashCode() : 0);
        result = 31 * result + (echo != null ? echo.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        return result;
    }
}
