package vip.epss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Admin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping(value = "/admin")   //http://localhost:8888/day20221130_war/admin
@Controller
public class AdminController {
    private List<Admin> admins = new ArrayList<>();

    public AdminController(){
        Admin admin1 = new Admin();admin1.setAdminname("zs1");admin1.setId(1);admin1.setPassword("123");
        Admin admin2 = new Admin();admin2.setAdminname("zs2");admin2.setId(2);admin2.setPassword("123");
        Admin admin3 = new Admin();admin3.setAdminname("zs3");admin3.setId(3);admin3.setPassword("123");
        Admin admin4 = new Admin();admin4.setAdminname("zs4");admin4.setId(4);admin4.setPassword("123");
        admins.add(admin1);admins.add(admin2);admins.add(admin3);admins.add(admin4);
    }


    @RequestMapping(value = "/index")  //http://localhost:8888/day20221130_war/admin/index
    public ModelAndView toIndex(/*ModelAndView modelAndView*/){
        //        return "../WEB-INF/adminpage/list.jsp";//转发 进入列表页   ，   显示admin的列表内容
        //springMVC中可以通过视图解析器 ，作用，拼接视图地址 , 通过配置文件完成
//        return "adminpage/list";    //     /WEB-INF/     adminpage/list    .jsp

        //转发页面的同时，需要携带数据  , 可以使用DI自动注入的 ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminpage/list");//设置view，   View实例都会被 视图解析器  进行拼接
        modelAndView.addObject("adminList",admins);//设置model

        return modelAndView;
    }

    @GetMapping(value = "/del")
    public ModelAndView del(Integer no){
        ModelAndView modelAndView = new ModelAndView("redirect:index");
        System.out.println("删除一个admin" + no);
        admins.remove(no.intValue() - 1);//List提供的方法删除时  Integer对象不能解封装  。需要手动转换
        //跳转到列表页
        return modelAndView;
    }

    @GetMapping(value = "/upd")
    public ModelAndView upd(@RequestParam Integer no){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("想修改一个admin" + no);
        // 先去获取这个admin的详细信息
        Admin ret = admins.get(no - 1);//List提供的方法  Integer对象不能解封装  。需要手动转换 或  修饰 @RequestParam
        // 转换到修改表单页面
        modelAndView.setViewName("adminpage/updForm");
        modelAndView.addObject("admin",ret);
        //跳转到修改表单页
        return modelAndView;
    }

    @PostMapping(value = "/update")
    public ModelAndView update(Admin admin){
        ModelAndView modelAndView = new ModelAndView("redirect:index");
        System.out.println("修改了一个admin");
        int i = 0;
        for (; i < admins.size(); i++) {
            if(admins.get(i).getId() == admin.getId()){
                break;
            }
        }
        admins.set(i,admin);
        //跳转到列表页
        return modelAndView;
    }

    @PostMapping(value = "/add")    //  http://localhost:8888/day20221130_war/admin/add   重定向到    http://localhost:8888/day20221130_war/admin/index
    public ModelAndView add(Admin admin){
        ModelAndView modelAndView = new ModelAndView("redirect:index");
//        ModelAndView modelAndView = new ModelAndView("redirect:../hello/he1");
//        ModelAndView modelAndView = new ModelAndView("redirect:http://www.baidu.com");
        System.out.println("添加一个admin");
        admin.setId(admins.size());//伪装
        admins.add(admin);
        //跳转到列表页
        return modelAndView;
    }


    @GetMapping(value = "/addF")
    public String addF(){
        return "adminpage/addForm";//转发到该地址
    }


    // 必须要有MultipartFile类型参数。而且参数名必须与表单file控件名一致
    @ResponseBody
    @PostMapping(value = "/upload")
    public String upload(MultipartFile upfile) {
        //上传图片存储目录
        String path = "c:/b/upload";
        //获取文件名并使用UUID生成新文件名
        String fileName = upfile.getOriginalFilename();
        String newFileName = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));
        //在指定上传图片存储目录中创建新文件
        File targetFile = new File(path, newFileName);
        //如果找不到指定目录和文件，就新创建此目录和文件
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        //将文件写入硬盘（myFile在内存中）
        try {
            upfile.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }

}
