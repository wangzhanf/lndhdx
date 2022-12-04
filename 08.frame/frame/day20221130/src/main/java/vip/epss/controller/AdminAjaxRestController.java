package vip.epss.controller;

import org.springframework.web.bind.annotation.*;
import vip.epss.domain.Admin;

@RequestMapping("/adminar")
@RestController   //  @Controller 和  @ResponseBody 合体
public class AdminAjaxRestController {

    @GetMapping(value = "/opt/{aid}")
    public String get(@PathVariable("aid")Integer id){
        return "get:"+id.toString();
    }

    @DeleteMapping(value = "/opt/{aid}")
    public String delete(@PathVariable("aid")Integer id){
        return "delete:"+id.toString();
    }

    @PostMapping(value = "/opt")
    public String add(Admin admin){
        System.out.println(admin);
        return admin.toString();
    }

    @PutMapping(value = "/opt/{aid}")
    public String update(@PathVariable("aid")Integer id,Admin admin){
        System.out.println(admin);
        return "id:" + id + "," + admin.toString();
    }


}
