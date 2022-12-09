package vip.epss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import vip.epss.domain.Conndb;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class Day2022120903ApplicationTests {

    @Autowired
    private Environment environment;

    @Autowired
    private Conndb conndb;

    @Test
    void contextLoads() {
    }

    //测试数据库是否能够正确连接
    @Test
    public void testConnectionDB() throws Exception {
//        Class.forName(this.environment.getProperty("conndb.driver"));//加载驱动
        Class.forName(this.environment.getProperty(conndb.getDriver()));//加载驱动
        Connection connection = DriverManager.getConnection(conndb.getUrl(), conndb.getUsername(), conndb.getPassword());


    }

}
