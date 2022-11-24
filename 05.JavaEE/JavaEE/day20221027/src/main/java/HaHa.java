import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HaHa extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("haha");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String connection = req.getHeader("Connection");
        System.out.println(connection);
        System.out.println("hahahahahahah");

        PrintWriter writer = resp.getWriter();
        writer.println(connection);
        writer.close();
    }
}
