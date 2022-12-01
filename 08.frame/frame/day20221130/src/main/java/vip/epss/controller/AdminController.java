package vip.epss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vip.epss.domain.Admin;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/admin")   //http://localhost:8888/day20221130_war/admin
@Controller
public class AdminController {
    @RequestMapping(value = "/index")  //http://localhost:8888/day20221130_war/admin/index
    public ModelAndView toIndex(/*ModelAndView modelAndView*/){
        //        return "../WEB-INF/adminpage/list.jsp";//转发 进入列表页   ，   显示admin的列表内容
        //springMVC中可以通过视图解析器 ，作用，拼接视图地址 , 通过配置文件完成
//        return "adminpage/list";    //     /WEB-INF/     adminpage/list    .jsp

        //转发页面的同时，需要携带数据  , 可以使用DI自动注入的 ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adminpage/list");//设置view，   View实例都会被 视图解析器  进行拼接

        List<Admin> admins = new ArrayList<>();
        Admin admin1 = new Admin();admin1.setAdminname("zs1");admin1.setId(1);
        Admin admin2 = new Admin();admin2.setAdminname("zs2");admin2.setId(2);
        Admin admin3 = new Admin();admin3.setAdminname("zs3");admin3.setId(3);
        Admin admin4 = new Admin();admin4.setAdminname("zs4");admin4.setId(4);
        admins.add(admin1);admins.add(admin2);admins.add(admin3);admins.add(admin4);

        modelAndView.addObject("adminList",admins);//设置model

        return modelAndView;
    }
}
