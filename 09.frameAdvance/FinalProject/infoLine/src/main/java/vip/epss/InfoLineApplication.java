package vip.epss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("vip.epss.mapper")
public class InfoLineApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoLineApplication.class, args);
    }
}
