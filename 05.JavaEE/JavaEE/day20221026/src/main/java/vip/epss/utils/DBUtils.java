package vip.epss.utils;

import java.sql.*;

//数据库工具类，目的是让用户方便的获取Connection，关闭资源
public class DBUtils {
    static Connection conn = null;
    //类加载时就需要加载驱动，写在static代码块
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();//打印调试
        }
    }
    //方便用户取得Connection对象，static类方法
    public static Connection getConn(){
        if(conn == null){
            String url= "jdbc:mysql://localhost:3331/ele_se?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
            try {
                conn = DriverManager.getConnection(url,"root","111111");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    //释放资源
    public static void close(ResultSet rs, Statement st,Connection conn){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                close(st,conn);
            }
        }
        return;
    }
    public static void close(Statement st,Connection conn){
        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if(conn != null){
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return;
    }
}
