package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.domain.Admin;
import vip.epss.service.AdminServiceImpl;
import vip.epss.utils.MessageAndData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
//前后端状态不一致，非授权不能访问，没有提供退出机制
//提供给view的api接口   ，  View使用任意前端技术 jQuery  实现单页应用
@WebServlet(urlPatterns = "/admin/login.do")
public class AdminLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取登录表单信息
        String adminName = req.getParameter("adminName");
        String password = req.getParameter("password");
        String vcode = req.getParameter("vcode");
        //取得session对象，用于验证码获取
        HttpSession session = req.getSession();
        String scode = (String)session.getAttribute("code");
        //System.out.println(session.getId());
        //System.out.println(session.getAttribute("code"));

        MessageAndData mad = null;



        //匹配验证码是否一致
        if(vcode.equalsIgnoreCase(scode)){
            //验证用户名和密码
            AdminServiceImpl adminService = new AdminServiceImpl();
            Admin admin = new Admin(adminName, password);
            Admin ret = adminService.loginOpt(admin);
            if(ret.getId()==null){
                mad = MessageAndData.error("用户名和密码不匹配");
            }else{//登录成功
                //处理session
                req.getSession().setAttribute("lStatus",true);
                req.getSession().setAttribute("adName",ret.getAdminName());
                req.getSession().setMaxInactiveInterval(60*60*12);
                mad = MessageAndData.success("欢迎回来");
            }
        }else{
            mad = MessageAndData.error("验证码不正确");
        }

        //转换为JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String ret = objectMapper.writeValueAsString(mad);
        //返回给view,因为是前后端分离，交互JSON数据，需要告知客户端
        PrintWriter writer = resp.getWriter();
        writer.print(ret);
        writer.flush();
        writer.close();
    }
}
