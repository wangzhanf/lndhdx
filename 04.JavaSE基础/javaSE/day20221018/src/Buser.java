import java.sql.Timestamp;

//利用ORM    Object  Ralational Model
//表对类，字段对属性，记录对对象，多记录对集合框架
public class Buser {
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private Timestamp uptime;

    public Buser() {
    }

    public Buser(Integer id, String username, String password, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public Buser setUptime(Timestamp uptime) {
        this.uptime = uptime;
        return this;
    }

    /*@Override
    public String toString() {
        return "Buser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", uptime=" + uptime +
                '}';
    }*/

    @Override
    public String toString() {
        return "" +
                "\t" + id +
                "\t\t\t\t" + username +
                "\t\t\t\t" + password +
                "\t\t\t\t" + phone +
                "\t\t\t\t" + uptime +
                "";
    }
}
