package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminVO;
import vip.epss.domain.Business;
import vip.epss.domain.Info;
import vip.epss.service.AdminServiceImpl;
import vip.epss.service.BusinessServiceImpl;
import vip.epss.service.CommonService;
import vip.epss.utils.MessageAndData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//该Serlet的目的是添加商家
@WebServlet(urlPatterns = "/admin/addOne.do")
public class AdminAddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取客户端传递过来的数据值
        String adminName = req.getParameter("adminName");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String avatar = req.getParameter("avatar");
        String gender = req.getParameter("gender");
        Boolean bgender = gender=="1"?true:false;

        Info info = new Info();
        info.setAvatar(avatar).setGender(bgender).setPhone(phone);
        Admin admin = new Admin(adminName,password).setInfo(info);
        //调用service执行查询业务
        CommonService<Admin, AdminVO> adminService = new AdminServiceImpl();
        Integer num  = adminService.addOne(admin);
        //封装查询结果
        MessageAndData mad = null;
        if(num<1)
            mad = MessageAndData.error("添加管理员数据失败");
        else
            mad = MessageAndData.success("添加管理员数据成功");
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
