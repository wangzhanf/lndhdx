package vip.epss.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Info implements Serializable {
    private Integer id;
    private Integer aid;
    private String phone;
    private String avatar;
    private Boolean gender;
    private Timestamp uptime;
}
