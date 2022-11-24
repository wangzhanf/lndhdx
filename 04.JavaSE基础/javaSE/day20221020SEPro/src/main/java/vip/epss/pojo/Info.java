package vip.epss.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class Info implements Serializable {
    private Integer id;
    private Integer aid;
    private Admin admin;/*1对1*/
    private String phone;
    private String avatar;
    private Boolean gender;
    private Timestamp uptime;

    public Info() {
    }

    public Info(Integer aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", aid=" + aid +
                ", admin=" + admin +
                ", phone='" + phone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", uptime=" + uptime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Info setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getPhone() {
        return phone;
    }

    public Info setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }
}
