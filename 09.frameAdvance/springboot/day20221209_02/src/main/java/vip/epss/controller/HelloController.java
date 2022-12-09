package vip.epss.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin("*")
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/h1")
    public String t1(){
        System.out.println("helllllllo");
        return "hello";
    }
}
