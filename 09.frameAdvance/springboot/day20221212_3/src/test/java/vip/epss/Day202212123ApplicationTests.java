package vip.epss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.epss.dao.AdminDao;
import vip.epss.domain.Admin;

@SpringBootTest
class Day202212123ApplicationTests {

    @Autowired
    private AdminDao adminDao;

    @Test
    void contextLoads() {
    }

    //测试MP
    @Test
    public void test01(){
        Admin admin = adminDao.selectById(1);
        System.out.println(admin);
    }

}
