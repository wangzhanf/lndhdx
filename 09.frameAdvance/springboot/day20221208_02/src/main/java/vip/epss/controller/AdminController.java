package vip.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.epss.service.AdminService;

@RestController
@RequestMapping("admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping
    public String test02(){
        System.out.println("test02");
        adminService.abc();
        return "test02";
    }
}
