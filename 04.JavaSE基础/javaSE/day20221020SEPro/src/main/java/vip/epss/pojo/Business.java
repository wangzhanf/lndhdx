package vip.epss.pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Business {
    private Integer id;
    private String password;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private Double starPrice;
    private Double deliveryPrice;
    private Integer aid;
    private Admin admin;
    private Timestamp uptime;
    private List<Food> foodList = new ArrayList<>();/*1对多关系*/

    public Business() {
    }

    public Business(String password, String businessName, Integer aid) {
        this.password = password;
        this.businessName = businessName;
        this.aid = aid;
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
                ", foodList=" + foodList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public Double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(Double starPrice) {
        this.starPrice = starPrice;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
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

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
