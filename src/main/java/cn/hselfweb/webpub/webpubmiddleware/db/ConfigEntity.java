/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.db;

import javax.persistence.*;

@Entity
@Table(name = "config")
public class ConfigEntity {
    private int id;
    private String webserver;
    private String backupPath;
    private String sitesPath;
    private Integer status;
    private String mysqlRoot;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "webserver")
    public String getWebserver() {
        return webserver;
    }

    public void setWebserver(String webserver) {
        this.webserver = webserver;
    }

    @Basic
    @Column(name = "backup_path")
    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    @Basic
    @Column(name = "sites_path")
    public String getSitesPath() {
        return sitesPath;
    }

    public void setSitesPath(String sitesPath) {
        this.sitesPath = sitesPath;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "mysql_root")
    public String getMysqlRoot() {
        return mysqlRoot;
    }

    public void setMysqlRoot(String mysqlRoot) {
        this.mysqlRoot = mysqlRoot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfigEntity that = (ConfigEntity) o;

        if (id != that.id) return false;
        if (webserver != null ? !webserver.equals(that.webserver) : that.webserver != null) return false;
        if (backupPath != null ? !backupPath.equals(that.backupPath) : that.backupPath != null) return false;
        if (sitesPath != null ? !sitesPath.equals(that.sitesPath) : that.sitesPath != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (mysqlRoot != null ? !mysqlRoot.equals(that.mysqlRoot) : that.mysqlRoot != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (webserver != null ? webserver.hashCode() : 0);
        result = 31 * result + (backupPath != null ? backupPath.hashCode() : 0);
        result = 31 * result + (sitesPath != null ? sitesPath.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (mysqlRoot != null ? mysqlRoot.hashCode() : 0);
        return result;
    }
}
