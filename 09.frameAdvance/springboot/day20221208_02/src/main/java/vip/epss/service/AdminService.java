package vip.epss.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class AdminService {
    public String abc(){
        System.out.println("abc...........");
        return "abc";
    }
}
