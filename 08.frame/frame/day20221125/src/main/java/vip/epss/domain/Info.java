package vip.epss.domain;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private Integer id;

    private Integer aid;

    private String phone;

    private String avatar;

    private Boolean gender;

    private Admin admin;

    private Date uptime;


}