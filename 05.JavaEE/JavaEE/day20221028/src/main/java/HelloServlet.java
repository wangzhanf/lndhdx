import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/hello.do")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");


        String arg1 = req.getParameter("arg1");
        System.out.println(arg1);

        String ret = "傻的" + arg1;
//        Map<String ,String> myMap = new HashMap<String,String>();
//        myMap.put("ret1",ret);


        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json;charset=utf-8");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(ret);

        writer.print(s);
        writer.close();

    }
}
