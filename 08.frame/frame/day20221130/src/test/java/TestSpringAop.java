import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.epss.service.BusinessService;

import java.io.IOException;

public class TestSpringAop {
    @Test
    public void testSpringAopByAnnotation(){
//        //通过读取spring配置文件拿到IOC容器
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //通过IOC容器拿到 Bean
//        AdminService adminService = classPathXmlApplicationContext.getBean("adminService", AdminService.class);
//        //使用Bean
//        adminService.testMethod1();//模拟未切入的操作
//        adminService.testMethod2();//模拟切入的操作
    }


    @Test
    public void testSpringAopByAnnotationFive() throws IOException {
//        //通过读取spring配置文件拿到IOC容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //通过IOC容器拿到 Bean
        BusinessService businessService = classPathXmlApplicationContext.getBean("businessService", BusinessService.class);
//        //使用Bean
        Integer i = businessService.deleteByPrimaryKey(3);
        System.out.println(i);
    }


}
