package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.epss.dao.AdminDao;
import vip.epss.domain.Admin;

@RestController
@RequestMapping("admins")
public class AdminController {

    @Autowired
    private AdminDao adminDao;

    @GetMapping
    public String test(){
        Admin admin = adminDao.selectByPrimaryKey(1);
        System.out.println(admin);
        System.out.println("--------------------------------");
        for (Admin admin1 : adminDao.selectByExample()) {
            System.out.println(admin1);
        }


        return "success";
    }
}
