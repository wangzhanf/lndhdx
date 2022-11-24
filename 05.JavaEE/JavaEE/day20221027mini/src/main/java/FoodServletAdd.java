import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/addFood.do")
public class FoodServletAdd extends HttpServlet {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    @Override
    public void destroy() {
        DBUtils.close(null,null,conn);
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        conn = DBUtils.getConn();
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String foodName = req.getParameter("foodName");
        String foodExplain = req.getParameter("foodExplain");
        //用户输入的数据默认都是字符串
        Double foodPrice = Double.valueOf(req.getParameter("foodPrice"));
        Integer bid = Integer.valueOf(req.getParameter("bid"));
        String s = "";

        String sql = "insert into food (foodName,foodExplain,foodPrice,bid) values (?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,foodName);
            ps.setString(2,foodExplain);
            ps.setDouble(3,foodPrice);
            ps.setInt(4,bid);
            int i = ps.executeUpdate();
            if(i>0){
                s = "插入数据成功";
            }else{
                s = "插入数据失败";
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }

        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json;charset=utf-8");//返回的数据类型是HTML
        ObjectMapper objectMapper = new ObjectMapper();
        s = objectMapper.writeValueAsString(s);
        writer.print(s);
        writer.close();
    }
}
