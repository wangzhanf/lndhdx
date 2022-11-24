package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminVO;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessVO;
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

//该Serlet的目的是删除商家
@WebServlet(urlPatterns = "/admin/get.do")
public class AdminGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取客户端传递过来的id值
        Integer id = Integer.valueOf(req.getParameter("id"));
        //调用service执行查询业务
        CommonService<Admin, AdminVO> adminService = new AdminServiceImpl();
        Admin admin  = adminService.selectOne(id);
        //封装查询结果
        MessageAndData mad = null;
        if(admin == null)
            mad = MessageAndData.error("获取单个商家数据失败");
        else
            mad = MessageAndData.success("获取单个商家数据成功").add("bus",admin);
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
