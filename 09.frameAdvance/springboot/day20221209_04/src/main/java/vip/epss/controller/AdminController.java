package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.epss.dao.AdminDao;
import vip.epss.domain.Admin;


@RestController
@RequestMapping("admins")
public class AdminController {

    @Autowired
    private AdminDao adminDao;


    @GetMapping
    public String test(){
        for (Admin admin1 : adminDao.selectByExample()) {
            System.out.println(admin1);
        }
        return "success";
    }

    @GetMapping("{did}")
    public String test1(@PathVariable("did") Integer id){
        Admin admin = adminDao.selectByPrimaryKey(id);
        System.out.println(admin);
        return "success";
    }

    @PostMapping
    public String test2(Admin admin){
        Integer insert = adminDao.insert(admin);
        return ""+ insert;
    }

}
