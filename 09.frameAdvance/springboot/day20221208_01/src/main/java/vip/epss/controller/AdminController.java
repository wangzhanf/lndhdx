package vip.epss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admins")
public class AdminController {
    @GetMapping
    public String test01(){
        System.out.println("test 01 .......");
        return "{'msg':'test01'}";
    }
}
