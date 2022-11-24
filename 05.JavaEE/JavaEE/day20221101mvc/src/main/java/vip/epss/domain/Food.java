package vip.epss.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Food  implements Serializable {
    private Integer id;
    private String foodName;
    private String foodExplain;
    private Double foodPrice;
    private Integer bid;
    private Timestamp uptime;

    public Food() {
    }

    public Food(String foodName, Double foodPrice, Integer bid) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.bid = bid;
    }

    public Integer getId() {
        return id;
    }

    public Food setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFoodName() {
        return foodName;
    }

    public Food setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public Food setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
        return this;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public Food setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
        return this;
    }

    public Integer getBid() {
        return bid;
    }

    public Food setBid(Integer bid) {
        this.bid = bid;
        return this;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public Food setUptime(Timestamp uptime) {
        this.uptime = uptime;
        return this;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodPrice=" + foodPrice +
                ", bid=" + bid +
                ", uptime=" + uptime +
                '}';
    }
}
