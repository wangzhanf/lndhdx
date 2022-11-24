package vip.epss.dao;

import vip.epss.pojo.Admin;
import vip.epss.pojo.Info;
import vip.epss.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao implements DaoImpl<Admin> {
    private Connection conn = DBUtils.getConn();
    private PreparedStatement ps = null;
    ResultSet resultSet = null;

    @Override
    public Boolean deleteByPrimaryKey(Integer id) {
        String sql = "delete from admin where id=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return true;
    }


    @Override
    public Admin selectByPrimaryKey(Integer id) {
        String sql = "select * from admin where id=?";
        Admin admin = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            resultSet = ps.executeQuery();
            if(resultSet.next()){
                admin = new Admin(resultSet.getString("adminName"),
                        resultSet.getString("password")).
                setId(resultSet.getInt("id")).
                setUptime(resultSet.getTimestamp("uptime"));
//                admin.setId(resultSet.getInt("id"));
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(resultSet,ps,null);
        }
        //处理结果
//        System.out.println(admin)
        return admin;
    }

    @Override
    public List<Admin> selectAll() {
        String sql = "select * from admin";
        List<Admin> admins = new ArrayList<>();
        try{
            ps = conn.prepareStatement(sql);
            resultSet = ps.executeQuery();
            while(resultSet.next()){
                admins.add(new Admin(resultSet.getString("adminName"),
                        resultSet.getString("password")).
                        setId(resultSet.getInt("id")).
                        setUptime(resultSet.getTimestamp("uptime")));
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(resultSet,ps,null);
        }
        return admins;
    }

    @Override
    public Boolean insertSelective(Admin obj) {
        String sql = "insert into admin (adminName,password) values (?,?)";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getAdminName());
            ps.setString(2,obj.getPassword());
            ps.execute();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return true;
    }

    @Override
    public Boolean updateSelective(Admin obj) {
        String sql = "update admin set adminName=?,password=? where id=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getAdminName());
            ps.setString(2,obj.getPassword());
            ps.setInt(3,obj.getId());
            ps.execute();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return true;
    }

    //多表联查封装对象，该类特有的，无需定义在接口中
    @Override
    public Admin selectByPrimaryKeyWithObject(Integer id){
        String sql = "select\n" +
                "    a.id as pid,\n" +
                "    a.adminName as adminName,\n" +
                "    a.password as password,\n" +
                "    a.uptime as puptime,\n" +
                "    i.id as sid,\n" +
                "    i.phone as phone\n" +
                "from admin as a\n" +
                "         left join info as i\n" +
                "             on a.id = i.aid\n" +
                "where a.id = ?";
        Admin admin = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            resultSet = ps.executeQuery();
            if(resultSet.next()){
                admin = new Admin(
                        resultSet.getString("adminName"),
                        resultSet.getString("password")).
                        setId(resultSet.getInt("pid")).
                        setUptime(resultSet.getTimestamp("puptime")).
                        setInfo(new Info().
                                setId(resultSet.getInt("sid")).
                                setPhone(resultSet.getString("phone"))
                        )
                ;
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(resultSet,ps,null);
        }
        return admin;
    }

    //用于登录检查时核对用户名和密码  ,
    /**
     * Parmeter Admin:  用户输入的用户名和密码组装后的Admin对象
     * Return: Admin ,数据表中查询后的结果组装的Admin对象，如果未查询到返回null
     * */
    public Admin selectByCondition(Admin admin){
        String sql = "select * from admin where adminName=? and password=?";
        Admin ret = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getPassword());
            resultSet = ps.executeQuery();
            if(resultSet.next()){
                ret = new Admin(resultSet.getString("adminName"),
                        resultSet.getString("password")).
                        setId(resultSet.getInt("id")).
                        setUptime(resultSet.getTimestamp("uptime"));
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(resultSet,ps,null);
        }
        return ret;
    }

}
