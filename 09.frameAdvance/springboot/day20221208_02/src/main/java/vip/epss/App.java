package vip.epss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.epss.service.AdminService;

//SpringBoot的主启动类, 需要注解
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);


//        //通过反射将启动类加载,当前类，  获得IOC容器
//        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
//        AdminService adminService = configurableApplicationContext.getBean("adminService", AdminService.class);
//        adminService.abc();


//          典型的通过配置文件xml实现bean的装配
//        //演示如何获得IOC
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //从容器中获取bean
//        AdminService adminService = classPathXmlApplicationContext.getBean("adminService", AdminService.class);
//        //调用bean的相关方法
//        adminService.abc();
    }
}
