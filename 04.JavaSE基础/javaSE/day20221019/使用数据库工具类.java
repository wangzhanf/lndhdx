import vip.epss.util.DButil;

import java.sql.*;
import java.text.SimpleDateFormat;

public class 使用数据库工具类 {
    public static void main(String[] args) throws SQLException {
        OperatorBuser operatorBuser = new OperatorBuser();
//        operatorBuser.addTest();
        operatorBuser.delTest("4;delete from buser");
//        operatorBuser.selectTest();
        operatorBuser.closeRes();
    }
}
//操作buser表的业务类
class OperatorBuser{
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet rs = null;

    public OperatorBuser() throws SQLException {
        conn = DButil.getConn();
        stat = conn.createStatement();
    }
    public void closeRes(){
        DButil.close(null,stat,conn);
    }


//课间休息：     9：20
    //增
    public void addTest() throws SQLException {
        String sql = "insert into buser (username,password,phone) value ('zs111','12311','11911')";
        stat.execute(sql);
    }
    //删
    public void delTest(String aid) throws SQLException {
        String sql = "delete from buser where id=4";
        stat.execute(sql);
    }
    //改
    public void updateTest(String aphone,Integer aid) throws SQLException{
        String sql = "update buser set phone=? where id=?";
        stat = (PreparedStatement)conn.prepareStatement(sql);
    }
    //查
    public void selectTest() throws SQLException {
        String sql = "select * from buser";
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("username"));
//            System.out.println(rs.getString("uptime"));
            //对时间进行格式化
            Timestamp cDate = rs.getTimestamp("uptime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
            String s = simpleDateFormat.format(cDate);
            System.out.println(s);
        }
        DButil.close(rs,null,null);
    }

}
