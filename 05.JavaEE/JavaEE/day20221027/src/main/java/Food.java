import java.io.Serializable;
import java.sql.Timestamp;

public class Food implements Serializable {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }



    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
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
