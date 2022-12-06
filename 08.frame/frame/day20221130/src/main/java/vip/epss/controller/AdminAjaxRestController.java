package vip.epss.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import vip.epss.domain.Admin;
import vip.epss.domain.Info;
import vip.epss.utils.MessageAndData;
import vip.epss.utils.UpUtils;

import javax.servlet.http.HttpServletRequest;
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

    //最原始的rest风格的post
    /*@PostMapping(value = "/opt")
    public String add(Admin admin){
        System.out.println(admin);
        return admin.toString();
    }*/

    @PostMapping(value = "/opt")
    public MessageAndData add(@RequestParam(value = "upfile" ,required = false ) MultipartFile upfile1, Admin admin, HttpServletRequest httpServletRequest){
        //System.out.println(upfile);
        //System.out.println(admin);
        String path = "c:/b/upload";
        String avatar = UpUtils.saveFile(upfile1, path);
        Info info = new Info();
        info.setAvatar(avatar);
        admin.setInfo(info);


        //1 方案：  后端通过手动方式获取参数,原因是前端通过formData重新封装数据， 没有对应的实体类【HttpServletRequest会被自动封装到handler，声明即可使用】
        // 分割字串的方式拼接成一个Admin对象。
        //String infoData = httpServletRequest.getParameter("infoData");
        //System.out.println(infoData);

        //2 方案：  前端传递数据时按照后端实体进行包装，后端使用实体类参数接收即可  【代码参考  ajaxJsonRequestDemo.html  42行】
        System.out.println(admin);
        return MessageAndData.success().addData("admin",admin);
    }

    @PutMapping(value = "/opt/{aid}")
    public String update(@PathVariable("aid")Integer id,Admin admin){
        System.out.println(admin);
        return "id:" + id + "," + admin.toString();
    }


}
