package vip.epss.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        if("zs".equals(uname) && "123".equals(upass)){
            HttpSession session = req.getSession();
            session.setMaxInactiveInterval(60*60);
            session.setAttribute("un",uname);
            session.setAttribute("sta",true);
            //转到管理主页面
            //req.getRequestDispatcher();
            //resp.sendRedirect("http://localhost:7777/day20221031/WEB-INF/adminBroad.jsp");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/adminBroad.jsp");
            requestDispatcher.forward(req,resp);
        }else{
            //返回到登录页面
            //System.out.println(req.getContextPath());
            resp.sendRedirect(req.getContextPath() + "/index.jsp?msg=" + URLEncoder.encode("用户名和密码不匹配", StandardCharsets.UTF_8));
            //resp.sendRedirect("index.jsp?msg=用户名和密码不匹配");//会有乱码
        }
    }
}
