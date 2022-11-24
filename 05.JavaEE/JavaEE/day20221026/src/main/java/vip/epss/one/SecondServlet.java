package vip.epss.one;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//1 继承 HttpServlet
public class SecondServlet extends HttpServlet {
    //2 覆写父类的方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //3 通过request可以拿到用户请求的内容
        String aname = req.getParameter("adminName");//获取传递的参数变量
        String apass = req.getParameter("password");
        System.out.println(aname + "|" + apass);

        //4 通过  response 给客户响应
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer = resp.getWriter();
        writer.println("登录成功");
        writer.close();
    }


}
