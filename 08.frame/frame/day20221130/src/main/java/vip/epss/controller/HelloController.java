package vip.epss.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vip.epss.domain.Admin;
import vip.epss.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequestMapping("/hello")   // http://localhost:8888/day20221130_war/hello   baseUrl
//@ResponseBody
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/he1")   // http://localhost:8888/day20221130_war/hello/he1
    //可以认为是在映射处理器注册 url和handler的映射关系   (new AdminController).hello()
    public String hello1(){   // 方法会被SpringMvc接管
        return "111";  //默认返回的字符串会被作为View视图的名字， 一般对应关系   111  ===   111.jsp
    }

    @RequestMapping(path = "/he2")    //可以认为是在映射处理器注册 url和handler的映射关系   (new AdminController).hello()
    public String hello2(){   // 方法会被SpringMvc接管
        return "222";
    }

    @RequestMapping(value = "/he3",method = {RequestMethod.GET,RequestMethod.POST})   // 传统servlet通过  doPost，doGet分别响应用户的不同HTTP方法
    public String hello3(){
        return "333";
    }

    @GetMapping("/he4")
    // String    forward到视图页   ，   redirect:http://www.baidu.com
    public String hello4(){
        return "444";
    }

    @GetMapping("/he5")   //http://localhost:8888/day20221130_war/hello/he5?username=zs&age=18&salary=123.45&hobby=football&hobby=basketball
    public String hello5(String username,Integer age,Double salary,String[] hobby){
        String ret = "username:" + username + ",age:" + (++age) + ",salary:" + salary;
        for (String temp: hobby) {
            ret += temp + "|";
        }
        return ret;
    }

    @GetMapping("/he6")   //http://localhost:8888/day20221130_war/hello/he5?uname=zs&age=18&salary=123.45&hobby=football&hobby=basketball
    public String hello6(@RequestParam(value = "uname",required = false,defaultValue = "guest") String username,Integer age,Double salary,String[] hobby){
        String ret = "username:" + username + ",age:" + (++age) + ",salary:" + salary;
        for (String temp: hobby) {
            ret += temp + "|";
        }
        return ret;
    }

    @GetMapping("/he7")
    public String hello7(Admin admin){
        return admin.toString();
    }

    @GetMapping("/he9")
    public String hello9(){
        //仿造人工获得Spring IOC容器工作
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //通过IOC容器拿到 Bean
        AdminService adminService = classPathXmlApplicationContext.getBean("adminService", AdminService.class);
//        //使用Bean
        Integer i = adminService.deleteByPrimaryKey(9);
        System.out.println(i);
        return "" + i;
    }

    @GetMapping("/he8")
    public String hello8(Admin admin, HttpSession httpSession, HttpServletRequest res, HttpServletResponse resp){
        String ret= "";
//        resp.setHeader("content-Type","charset;text/html");
        System.out.println(httpSession.getAttribute("uname"));

        if(admin.getAdminname().equals("wangzf")&&admin.getPassword().equals("654321")){
            //成功登录 返回成功信息， 还需要处理session
            httpSession.setMaxInactiveInterval(30);
            httpSession.setAttribute("loginStatus",true);
            httpSession.setAttribute("uname",admin.getAdminname());

            ret = "欢迎回来";
        }else{
            ret = "用户名或密码错误";
        }
        return ret;
    }

    @GetMapping(value = "/login.do")
    public String hello9(@RequestParam(value = "aname",required = false,defaultValue = "zs") String username,@RequestParam("apass")String password,HttpSession httpSession){
        String ret="";
        if("zs".equals(username) && "123".equals(password)){
            httpSession.setMaxInactiveInterval(30);
            httpSession.setAttribute("uname",username);
            ret = "../a.jsp";
        }else{
            ret = "../index.jsp";
        }
        return "redirect:"+ret;   //因为视图解析器的介入， 不进入安全目录的访问建议   redirect:   重定向
    }

    @GetMapping(value = "/logout.do")
    public String hello10(HttpSession httpSession){
        String ret="";
        httpSession.setMaxInactiveInterval(30);
        httpSession.setAttribute("uname",null);
        httpSession.invalidate();
        ret = "../index.jsp";
        return "redirect:"+ret;
    }

}
