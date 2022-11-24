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
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/listFood.do")
public class FoodServletList extends HttpServlet {
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

        String s = "";

        String sql = "select * from food";
        List<Food> foods = new ArrayList<>();
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            //循环将查询到的数据放在Food对象
            while(rs.next()){
                foods.add(
                        new Food(
                                rs.getString("foodName"),
                                rs.getDouble("foodPrice"),
                                rs.getInt("bid")
                        )
                );
            }
            //借助第三方包实现JSON转换
            ObjectMapper objectMapper = new ObjectMapper();
            s = objectMapper.writeValueAsString(foods);


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json;charset=utf-8");//返回的数据类型是HTML
        writer.print(s);
        writer.close();
    }
}
