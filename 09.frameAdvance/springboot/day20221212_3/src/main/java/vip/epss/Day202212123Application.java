package vip.epss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "vip.epss.dao")     //启动应用时扫描dao层组件到IOC
public class Day202212123Application {

    public static void main(String[] args) {
        SpringApplication.run(Day202212123Application.class, args);
    }

}
