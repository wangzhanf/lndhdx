package vip.epss.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Business {
    private Integer id;

    private String password;

    private String businessname;

    private String businessaddress;

    private String businessexplain;

    private BigDecimal starprice;

    private BigDecimal deliveryprice;

    private Integer aid;

    //1对多关系    ，持有对方对象的集合
    private List<Food> foods = new ArrayList<>();

    private Date uptime;


}