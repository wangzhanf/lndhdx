import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestConstructor;
import vip.epss.service.AdminService;
import vip.epss.service.BusinessService;

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

    @Test
    public void testAnnotationDI(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BusinessService businessService = context.getBean("businessService", BusinessService.class);
        businessService.selectOne(66);
    }

    //
    //测试bean的相关属性
    @Test
    public void testInstance(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminService adminService = context.getBean("adminService",AdminService.class);
        AdminService adminService1 = context.getBean("adminService",AdminService.class);
        System.out.println(adminService);//hashcode相同，潜在的可以认为是地址相同
        System.out.println(adminService1);//hashcode相同，潜在的可以认为是地址相同
    }
}
