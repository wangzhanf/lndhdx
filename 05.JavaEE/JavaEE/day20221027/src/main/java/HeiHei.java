import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//映射地址   /hei.do  到 当前
//@WebServlet("/hei.do")
//当属性只有一个的时候可以省略键，多属性,号分割
@WebServlet(urlPatterns = "/hei.do",loadOnStartup = 1)
public class HeiHei extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("heihei");
    }
}
