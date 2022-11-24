package vip.epss.dao;

import vip.epss.domain.Admin;
import vip.epss.domain.Business;
import vip.epss.domain.Info;
import vip.epss.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao implements CommonDao<Admin>{
    private Connection conn = DBUtils.getConn();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    @Override
    public Integer count(String condition){
        Integer num = 0;
        String sql = "select count(a.id) as num  from admin as a " + condition;
        try{
            this.ps = this.conn.prepareStatement(sql);
            this.rs = ps.executeQuery();
            if(rs.next())
                num =  rs.getInt("num");
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }
        return num;
    }
    @Override
    public List<Admin> selectAll(Integer startR,Integer pageSize,String condition) {
        List<Admin> adminList =  new ArrayList<>();
        String sql = "select a.id as id,a.adminName as adminName,a.password as password,a.uptime as uptime,i.avatar as avatar,i.phone as phone,i.gender as gender,i.id as iid from admin as a left join info i on a.id = i.aid  " + condition + " order by id DESC limit ?,?";
        System.out.println(sql);
        try{
            this.ps  = this.conn.prepareStatement(sql);
            ps.setInt(1,startR);
            ps.setInt(2,pageSize);
            this.rs = ps.executeQuery();
            while (rs.next()){
                adminList.add(
                        new Admin(
                                rs.getString("adminName"),
                                rs.getString("password")
                        )
                                .setId(rs.getInt("id"))
                                .setUptime(rs.getTimestamp("uptime"))
                                .setInfo(new Info(rs.getInt("iid"))
                                        .setAvatar(rs.getString("avatar"))
                                        .setGender(rs.getBoolean("gender"))
                                        .setPhone(rs.getString("phone"))
                                        .setAid(rs.getInt("id")))
                );
                System.out.println(adminList);
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        return adminList;
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        Admin admin = new Admin();
        String sql = "select a.id as id,a.adminName as adminName,a.password as password,a.uptime as uptime,i.avatar as avatar,i.phone as phone,i.gender as gender,i.id as iid from admin as a left join info i on a.id = i.aid   where a.id=?";
        try{
            this.ps  = this.conn.prepareStatement(sql);
            this.ps.setInt(1,id);
            this.rs = ps.executeQuery();
            if(rs.next()){
                admin = new Admin(
                        rs.getString("adminName"),
                        rs.getString("password")
                )
                        .setId(rs.getInt("id"))
                        .setUptime(rs.getTimestamp("uptime"))
                        .setInfo(new Info(rs.getInt("id"))
                                .setAvatar(rs.getString("avatar"))
                                .setGender(rs.getBoolean("gender"))
                                .setPhone(rs.getString("phone"))
                                .setId(rs.getInt("iid")));

            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        return admin;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        String sql = "delete from admin where id=?";
        //"delete from business where id in 1,2,3,4,5,5,6"
        int i = 0;
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            i = ps.executeUpdate();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return i;
    }

    @Override
    public int insertSelective(Admin obj) {
        String sql = "insert into admin (adminName,password) values (?,?)";


        int i = 0;

        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getAdminName());
            ps.setString(2,obj.getPassword());
            i = ps.executeUpdate();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        //取得刚刚插入的id值
        Integer id=0;
        String sql1 = "select id from admin where adminName=?";
        try{
            ps = conn.prepareStatement(sql1);
            ps.setString(1,obj.getAdminName());
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt("id");
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        String sql2 = "insert into info(aid,phone,avatar,gender) values (?,?,?,?)";
        try{
            ps = conn.prepareStatement(sql2);
            ps.setInt(1,id);
            ps.setString(2,obj.getInfo().getPhone());
            ps.setString(3,obj.getInfo().getAvatar());
            ps.setBoolean(4,obj.getInfo().getGender());
            i = ps.executeUpdate();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        return i;
    }

    @Override
    public int updateSelective(Admin obj) {
        String sql = "update admin set adminName=?,password=? where id=?";
        int i = 0;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getAdminName());
            ps.setString(2,obj.getPassword());
            ps.setInt(3,obj.getId());
            i = ps.executeUpdate();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return i;
    }

    public Admin matchUandP(Admin admin){
        Admin retAdmin = new Admin();
        String sql = "select * from admin where adminName=? and password=?";
        try{
            this.ps  = this.conn.prepareStatement(sql);
            this.ps.setString(1,admin.getAdminName());
            this.ps.setString(2,admin.getPassword());
            this.rs = ps.executeQuery();
            if(rs.next()){
                retAdmin.setId(rs.getInt("id")).
                        setAdminName(rs.getString("adminName")).
                        setUptime(rs.getTimestamp("uptime"));

            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        return retAdmin;
    }
}
