import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.epss.service.AdminService;

public class TestSpringDI {
    public static void main(String[] args) {
        //1 通过读取Spring主配置文件获得IOC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 通过  getBean 方法获得容器中的  bean
//        Object adminService = context.getBean("adminService");
//        AdminService adminService = (AdminService)context.getBean("adminService");
        AdminService adminService = context.getBean("adminService",AdminService.class);
        //3 调用bean的相关方法
        adminService.selectOne(77);
    }
}
