import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//使用前先设置编码集
        resp.setCharacterEncoding("utf-8");
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        PrintWriter writer = resp.getWriter();
        String  flag="";
        if("王占峰".equals(uname) && "123".equals(upass)){
            flag = "登录成功";
        }else{
            flag = "登录失败";
        }
        resp.setContentType("text/html;charset=utf-8");//返回的数据类型是HTML
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("  <head><meta charset='UTF-8'>");
        writer.println("  <title>Servlet</title></head>");
        writer.println("  <body>");
        writer.println("登录状态，" + flag + "！");
        writer.println("  </body>");
        writer.println("</html>");
        writer.close();

        System.out.println(uname);
    }
}
