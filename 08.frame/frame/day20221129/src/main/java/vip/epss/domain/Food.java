package vip.epss.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    private Integer id;

    private String foodname;

    private String foodexplain;

    private BigDecimal foodprice;

    private Integer bid;

    private Date uptime;


}