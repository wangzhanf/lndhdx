package vip.epss.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class Admin implements Serializable {
    private Integer id;
    private String adminname;
    private String password;
    private Timestamp uptime;
}
