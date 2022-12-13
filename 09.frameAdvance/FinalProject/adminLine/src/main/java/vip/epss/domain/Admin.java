package vip.epss.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@TableName("admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员名称
     * 属性字段使用了驼峰语法， 框架会自动将驼峰转换为  _   分割模式
     * 1    通过 注解方式单个字段进行说明
     * 2    配置文件中关闭驼峰语法的转换
     */
    @TableField(value = "adminName")
    private String adminName;

    /**
     * 密码
     */
    private String password;

    /**
     * 记录修改时间
     */
    private LocalDateTime uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getUptime() {
        return uptime;
    }

    public void setUptime(LocalDateTime uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "Admin{" +
            "id=" + id +
            ", adminName=" + adminName +
            ", password=" + password +
            ", uptime=" + uptime +
        "}";
    }
}
