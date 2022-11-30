import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.epss.service.AdminService;
import vip.epss.service.BusinessService;

import java.io.IOException;

public class TestSpringMyBatis {

    @Test
    public void testSpringAndMyBatis(){
//        //通过读取spring配置文件拿到IOC容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //通过IOC容器拿到 Bean
        AdminService adminService = classPathXmlApplicationContext.getBean("adminService", AdminService.class);
//        //使用Bean
        Integer i = adminService.deleteByPrimaryKey(5);
        System.out.println(i);
    }
}
