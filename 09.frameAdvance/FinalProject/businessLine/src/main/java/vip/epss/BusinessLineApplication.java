package vip.epss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("vip.epss.mapper")
public class BusinessLineApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessLineApplication.class,args);
    }
}
