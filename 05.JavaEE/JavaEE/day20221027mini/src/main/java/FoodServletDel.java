import com.fasterxml.jackson.databind.ObjectMapper;

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

@WebServlet(urlPatterns = "/delFood.do")
public class FoodServletDel extends HttpServlet {
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


        Integer id = Integer.valueOf(req.getParameter("id"));
        String s = "";

        String sql = "delete from food where id=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            int i = ps.executeUpdate();
            if(i>0){
                s = "删除数据成功";
            }else{
                s = "删除数据失败";
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
