package vip.epss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Admin;

//@ResponseBody
//@Controller
@RestController
@RequestMapping(value = "/adminrest")
public class AdminRestController {

    @RequestMapping(value = "/opt",method = {RequestMethod.POST})
    public String add(Admin admin){
        return admin.toString();
    }

    @DeleteMapping(value = "/opt/{aid}")
    public String delete(@PathVariable("aid") Integer id){
        String str = "获得的删除参数是： " + id;
        System.out.println(str);
        return str;
    }

    @PutMapping(value = "/opt/{aid}")
    public String update(@PathVariable("aid") Integer id,Admin admin){
        return admin.toString() + " ,id: " + id;
    }


    @GetMapping(value = "/opt/{aid}") //REST携带数据，使用{}占位  ，此时aid为路径变量 ,仅仅用于springMVC路由标记
    public String get(@PathVariable("aid") Integer id){
        String str = "获得的查询参数是： " + id;
        System.out.println(str);
        return str;
    }
}
