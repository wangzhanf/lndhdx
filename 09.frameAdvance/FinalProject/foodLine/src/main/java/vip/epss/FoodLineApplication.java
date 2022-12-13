package vip.epss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("vip.epss.mapper")
public class FoodLineApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodLineApplication.class,args);
    }
}
