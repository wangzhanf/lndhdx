package vip.epss.domain;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer id;

    private String adminname;

    private String password;
    //需要多表联查，  表之间通过主外键关联的，  程序中通过  持有对方对象或对象集合表示
    private Info info;

    private Date uptime;


}