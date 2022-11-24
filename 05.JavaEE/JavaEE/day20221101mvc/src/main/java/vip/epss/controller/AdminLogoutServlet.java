package vip.epss.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import vip.epss.utils.MessageAndData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/admin/logout.do")
public class AdminLogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        MessageAndData mad = null;
        System.out.println(session.getAttribute("lStatus"));
        if((Boolean)session.getAttribute("lStatus")){
            //销毁session中的键值对
            session.setAttribute("lStatus",false);
            session.setAttribute("adName",null);
            session.invalidate();
            mad = MessageAndData.success("走好不送");
        }else{
            mad = MessageAndData.error("您还未登录过");
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
