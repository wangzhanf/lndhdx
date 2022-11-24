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

//@WebServlet(urlPatterns = "/addFood.do")
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = this.getServletConfig();
        String setC = servletConfig.getInitParameter("setC");
        System.out.println(setC);
        req.setCharacterEncoding(setC);
        resp.setCharacterEncoding(setC);

        String foodName = req.getParameter("foodName");
        String foodExplain = req.getParameter("foodExplain");
        //用户输入的数据默认都是字符串
        Double foodPrice = Double.valueOf(req.getParameter("foodPrice"));
        Integer bid = Integer.valueOf(req.getParameter("bid"));
        String flag = "";

        String sql = "insert into food (foodName,foodExplain,foodPrice,bid) values (?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,foodName);
            ps.setString(2,foodExplain);
            ps.setDouble(3,foodPrice);
            ps.setInt(4,bid);
            int i = ps.executeUpdate();
            if(i>0){
                flag = "插入数据成功";
            }else{
                flag = "插入数据失败";
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");//返回的数据类型是HTML
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("  <head><meta charset='UTF-8'>");
        writer.println("  <title>Servlet</title></head>");
        writer.println("  <body>");
        writer.println("返回状态：" + flag + "！");
        writer.println("  </body>");
        writer.println("</html>");
        writer.close();
    }
}
