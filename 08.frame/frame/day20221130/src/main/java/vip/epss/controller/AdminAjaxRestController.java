package vip.epss.controller;

import org.springframework.web.bind.annotation.*;
import vip.epss.domain.Admin;
import vip.epss.utils.MessageAndData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/adminar")
@RestController   //  @Controller 和  @ResponseBody 合体
public class AdminAjaxRestController {

    @GetMapping(value = "/opt/{aid}")
    public MessageAndData /*Map<String, Object>*/ /*List<Admin>*/ /*Admin*/ get(@PathVariable("aid")Integer id){
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(new Admin(1,"a","123",null,null));
        admins.add(new Admin(2,"b","123",null,null));
        admins.add(new Admin(3,"c","123",null,null));
//        return admins.get(id);//返回一个
        //return admins;//返回一个集合
        /*HashMap<String, Object> map = new HashMap<>();
        map.put("keyname1",admins.get(id));
        map.put("keyname2",admins);
        return map;*/

        MessageAndData messageAndData = MessageAndData.success();
        if(id < 0){//需要集合元素
            messageAndData.addData("adminList",admins);
        }else{//需要单一元素
            messageAndData.addData("admin",admins.get(id)).addData("one","first");
        }
        //return "get:"+id.toString();
//        System.out.println(messageAndData);
        return messageAndData;
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
