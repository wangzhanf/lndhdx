import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/show.do")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断是否登录
        HttpSession session = req.getSession();
        if(session.getAttribute("sta")!=null && (Boolean)session.getAttribute("sta") == true){
            System.out.println(session.getAttribute("un") +" 的敏感信息............");
        }else{
            System.out.println("还未登录请登录");
        }

    }
}
