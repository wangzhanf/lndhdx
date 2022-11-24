import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upass = req.getParameter("upass");
        if("zs".equals(uname) && "123".equals(upass)){
            //1 获取Session对象
            HttpSession session = req.getSession();
            session.setMaxInactiveInterval(60*60*1);
            session.setAttribute("sta",true);//登录状态
            session.setAttribute("un",uname);
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
