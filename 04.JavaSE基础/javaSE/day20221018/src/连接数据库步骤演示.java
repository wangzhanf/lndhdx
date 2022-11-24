import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class 连接数据库步骤演示 {
    public static void main(String[] args) throws Exception {
        //add();//调用add方法
        //del();
        //查所有数据  并列表显式
        chaAll();
        //将指定id修改为新的内容
        System.out.print("请输入需要修改记录的id值：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        /*System.out.print("请输入需要修改记录的id值：");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();*/
        //正常输入      2 回车
        //非正常输入    2;delete from buser   回车


        change(id);


    }

    public static void change(Integer argId){
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;



        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3331/llg?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true","root","111111");
            statement = conn.createStatement();
            String sql= "select * from buser where id = " + argId;
            resultSet = statement.executeQuery(sql);
            System.out.println("查询单个数据成功");
            //分解结果集并展示,ResultSet内存中的集合（自带迭代器），转换到自己的数据结构
//            回显数据到控制台
            resultSet.next();
            Buser old = new Buser(
                    resultSet.getInt("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("phone")
            ).setUptime(resultSet.getTimestamp("uptime"));
            System.out.println(old);//回填数据到表单方便用户查看
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入新密码：");
            String newPass = scanner.nextLine();
            System.out.print("请输入新手机号码：");
            String newPhone = scanner.nextLine();
            sql = "update buser set password='"+newPass+"',phone='"+newPhone+"' where id="+argId;
            System.out.println(sql);
            statement.execute(sql);

        }catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try{
                resultSet.close();
                statement.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void chaAll(){
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3331/llg?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true","root","111111");
            statement = conn.createStatement();
            String sql= "select * from buser";
            resultSet = statement.executeQuery(sql);
            System.out.println("查询成功");
            //分解结果集并展示,ResultSet内存中的集合（自带迭代器），转换到自己的数据结构
            List<Buser> busers = new ArrayList<>();
            while (resultSet.next()){
                /*
                busers.add(new Buser(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("phone")
                ).setUptime(resultSet.getTimestamp("uptime")));
                */
                /*
                Buser u = new Buser(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("phone")
                );
                u.setUptime(resultSet.getTimestamp("uptime"));
                busers.add(u);
                 */
                busers.add(new Buser(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("phone")
                ).setUptime(resultSet.getTimestamp("uptime")));
            }

            //迭代集合框架，在控制台输出
            /*for (int i = 0; i < busers.size(); i++) {
                System.out.println(busers.get(i));
            }*/
            /*Iterator<Buser> iterator = busers.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
            for (Buser b:busers) {
                System.out.println(b);
            }

        }catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try{
                resultSet.close();
                statement.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void del(){
        Connection conn = null;
        Statement statement = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3331/llg?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true","root","111111");
            statement = conn.createStatement();
            String sql= "delete from buser where id=5";
            boolean b = statement.execute(sql);
            System.out.println("删除成功");
        }catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try{
                statement.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void add() throws Exception {
        //1 加载驱动
        //Class.forName("com.mysql.jdbc.Driver");//mysql5.7之前的驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2 获取数据库连接句柄
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3331/llg?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true","root","111111");
        //3 Statement对象
        Statement statement = connection.createStatement();
        String sql = "insert into buser (username,password,phone) value ('lisi1','1231','13999999998')";
        //4 执行语句
        boolean b = statement.execute(sql);
        //5 处理结果集
        System.out.println("执行状态为：" + b);
        //6 关闭资源
        //只有结果集是ResultSet时需要关闭
        statement.close();
        connection.close();
    }
}
