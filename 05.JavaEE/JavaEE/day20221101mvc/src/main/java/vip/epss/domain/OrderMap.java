package vip.epss.domain;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrderMap implements Serializable {
    private Integer id;
    private Integer aid;
    private Integer fid;

    private Timestamp uptime;

    public OrderMap() {
    }

    public OrderMap(Integer aid, Integer fid) {
        this.aid = aid;
        this.fid = fid;
    }

    public Integer getId() {
        return id;
    }

    public OrderMap setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAid() {
        return aid;
    }

    public OrderMap setAid(Integer aid) {
        this.aid = aid;
        return this;
    }

    public Integer getFid() {
        return fid;
    }

    public OrderMap setFid(Integer fid) {
        this.fid = fid;
        return this;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public OrderMap setUptime(Timestamp uptime) {
        this.uptime = uptime;
        return this;
    }

    @Override
    public String toString() {
        return "OrderMap{" +
                "id=" + id +
                ", aid=" + aid +
                ", fid=" + fid +
                ", uptime=" + uptime +
                '}';
    }
}
