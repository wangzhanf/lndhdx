package vip.epss.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin("*")
@RestController
@RequestMapping("admins")

public class AdminController {
    @GetMapping("/hello")
    public String test01(){
        System.out.println("test03..嗡嗡嗡.........");
        return "test03...........额威威..哇哇哇哇...";
    }
}
