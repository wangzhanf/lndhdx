package vip.epss.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Food {
    private Integer id;

    private String foodname;

    private String foodexplain;

    private BigDecimal foodprice;

    private Integer bid;

    private Date uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public String getFoodexplain() {
        return foodexplain;
    }

    public void setFoodexplain(String foodexplain) {
        this.foodexplain = foodexplain == null ? null : foodexplain.trim();
    }

    public BigDecimal getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(BigDecimal foodprice) {
        this.foodprice = foodprice;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }
}