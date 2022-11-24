package vip.epss.pojo;

import vip.epss.utils.DTUtils;

import java.io.Serializable;
import java.sql.Timestamp;

public class Admin implements Serializable {
    private Integer id;
    private String adminName;
    private String password;
    private Info info;/*1对1*/
    private Timestamp uptime;

    public Admin(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", info=" + info +
                ", uptime=" + DTUtils.formatDateTime("yy年MM月",uptime) +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Admin setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAdminName() {
        return adminName;
    }

    public Admin setAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public Admin setInfo(Info info) {
        this.info = info;
        return this;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public Admin setUptime(Timestamp uptime) {
        this.uptime = uptime;
        return this;
    }
}
