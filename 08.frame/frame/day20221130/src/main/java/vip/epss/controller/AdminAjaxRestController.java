package vip.epss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/adminar")
@RestController   //  @Controller 和  @ResponseBody 合体
public class AdminAjaxRestController {

    @GetMapping(value = "/opt/{aid}")
    public String get(@PathVariable("aid")Integer id){
        return id.toString();
    }
}
