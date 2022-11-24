import com.fasterxml.jackson.databind.ObjectMapper;
import utils.MessageAndData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

@WebServlet(urlPatterns = "/msg.do")
public class MsgServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");

        String name = "wangzhanf";
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        HashSet<Double> doubles = new HashSet<>();
        doubles.add(2.3);
        doubles.add(3.14);

        MessageAndData mad  = MessageAndData.success("select成功").addData("n",name).addData("ints",integers).addData("ds",doubles);


        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json;charset=utf-8");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(mad);

        writer.print(s);
        writer.close();

    }
}
