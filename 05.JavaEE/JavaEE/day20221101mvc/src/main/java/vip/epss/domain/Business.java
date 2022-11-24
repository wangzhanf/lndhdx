package vip.epss.domain;

import java.io.Serializable;
import java.sql.Timestamp;
//实体搜索， 建议  后端处理， 搜索类继承实体类扩充功能
//
public class Business implements Serializable {
    private Integer id;
    private String password;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private Double starPrice;
    private Double deliveryPrice;
    private Integer aid;
    private Admin admin;//1对1多表联查
    private Timestamp uptime;

    public Business() {
    }

    public Business(String password, String businessName) {
        this.password = password;
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                ", businessExplain='" + businessExplain + '\'' +
                ", starPrice=" + starPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", aid=" + aid +
                ", admin=" + admin +
                ", uptime=" + uptime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Business setId(Integer id) {
        this.id = id;
        return  this;
    }

    public String getPassword() {
        return password;
    }

    public Business setPassword(String password) {
        this.password = password;
        return  this;
    }

    public String getBusinessName() {
        return businessName;
    }

    public Business setBusinessName(String businessName) {
        this.businessName = businessName;
        return  this;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public Business setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
        return  this;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public Business setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
        return  this;
    }

    public Double getStarPrice() {
        return starPrice;
    }

    public Business setStarPrice(Double starPrice) {
        this.starPrice = starPrice;
        return  this;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public Business setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
        return  this;
    }

    public Integer getAid() {
        return aid;
    }

    public Business setAid(Integer aid) {
        this.aid = aid;
        return  this;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Business setAdmin(Admin admin) {
        this.admin = admin;
        return  this;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public Business setUptime(Timestamp uptime) {
        this.uptime = uptime;
        return  this;
    }
}
