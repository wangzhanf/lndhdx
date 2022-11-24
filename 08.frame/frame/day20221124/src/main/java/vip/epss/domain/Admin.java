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
public class Admin implements Serializable {
    private Integer id;
    private String adminName;
    private String password;
    private Info info;
    private Timestamp uptime;
}
