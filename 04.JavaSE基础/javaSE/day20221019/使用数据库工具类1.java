import vip.epss.util.DButil;

import java.sql.*;
import java.text.SimpleDateFormat;

public class 使用数据库工具类1 {
    public static void main(String[] args) throws SQLException {
        OperatorBuser1 operatorBuser = new OperatorBuser1();
        operatorBuser.updateTest("10086';delete from buser where 1=1 ;",6);
        operatorBuser.closeRes();
    }
}
//操作buser表的业务类
class OperatorBuser1{
    private Connection conn = null;
    private PreparedStatement stat = null;
    private ResultSet rs = null;

    public OperatorBuser1() throws SQLException {
        conn = DButil.getConn();
    }
    public void closeRes(){
        DButil.close(null,stat,conn);
    }



    //改
    public void updateTest(String aphone,Integer aid) throws SQLException{
        String sql = "update buser set phone=? where id=?";
        stat = conn.prepareStatement(sql);
        stat.setString(1,aphone);
        stat.setInt(2,aid);
        stat.execute();
    }

}
