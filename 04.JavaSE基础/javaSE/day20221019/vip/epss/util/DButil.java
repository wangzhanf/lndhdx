package vip.epss.util;

import java.sql.*;

public class DButil {
    //static代码块在类加载时仅执行1次
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    //提供一个被包装好的容易使用的获取Connection方法
    public static Connection getConn(){
        String url = "jdbc:mysql://localhost:3331/llg?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user = "root";
        String pass = "111111";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,user,pass);
        }catch (SQLException se){
            se.printStackTrace();
        }
        return conn;
    }
    //关闭资源
    public static void close(ResultSet rs, Statement st, Connection conn){
        try{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            try{
                if(st != null){
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
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
    }
}