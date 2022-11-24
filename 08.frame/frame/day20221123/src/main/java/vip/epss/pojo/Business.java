package vip.epss.pojo;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

/*
* 1 实现序列化接口
* 2 成员属性对应数据表的字段，数据类型要兼容
* 3 持有映射的对象
* 4 提供空参和必选参数的构造
* 5 提供getter和setter【setter建议返回this对象】
* 6 覆写toString方法方便测试
* */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Business implements Serializable {
    private Integer id;
    private String password;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private Double starPrice;
    private Double deliveryPrice;
    private Integer aid;
    //如果存在多表关系
    private Admin admin;
    private Timestamp uptime;


    public Business(String password, String businessName) {
        this.password = password;
        this.businessName = businessName;
    }

}
