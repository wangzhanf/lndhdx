package vip.epss.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Info implements Serializable {
    private Integer id;
    private Integer aid;
    private String phone;
    private String avatar;
    private Boolean gender;

    private Timestamp uptime;

    public Info() {
    }

    public Info(Integer aid) {
        this.aid = aid;
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

    public Info setAid(Integer aid) {
        this.aid = aid;
        return this;
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

    public Info setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public Boolean getGender() {
        return gender;
    }

    public Info setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public Info setUptime(Timestamp uptime) {
        this.uptime = uptime;
        return this;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", aid=" + aid +
                ", phone='" + phone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", uptime=" + uptime +
                '}';
    }
}
