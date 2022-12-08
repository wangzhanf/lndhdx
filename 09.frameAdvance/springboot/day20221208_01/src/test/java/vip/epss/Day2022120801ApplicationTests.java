package vip.epss;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.epss.controller.AdminController;

@SpringBootTest
class Day2022120801ApplicationTests {

    @Autowired
    private AdminController adminController;

    @Test
    void contextLoads() {
        adminController.test01();
    }

}
