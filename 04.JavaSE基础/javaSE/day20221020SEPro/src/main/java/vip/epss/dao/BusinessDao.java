package vip.epss.dao;

import vip.epss.pojo.Business;
import vip.epss.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusinessDao implements DaoImpl<Business> {
    private Connection conn = DBUtils.getConn();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    @Override
    public Boolean deleteByPrimaryKey(Integer id) {

        return null;
    }

    public Boolean deleteByPrimaryKey1(Integer id) {
        Boolean flag = false;
        //在Dao层整合所有数据操作
        String sql3 = "delete from orderMap where fid in (select id from food where bid=?);";
        String sql2 = "delete from food where bid=?";
        String sql1 = "delete from business where id = ?;";
        try{
            conn.setAutoCommit(false);//关闭自动提交
                ps = conn.prepareStatement(sql3);
                ps.setInt(1,id);
                ps.executeUpdate();
                ps = conn.prepareStatement(sql2);
                ps.setInt(1,id);
                ps.executeUpdate();
                ps = conn.prepareStatement(sql1);
                ps.setInt(1,id);
                ps.executeUpdate();
            conn.commit();//手工提交事务
            conn.setAutoCommit(true);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        flag = true;
        return flag;
    }

    @Override
    public Business selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public Business selectByPrimaryKeyWithObject(Integer id) {
        return null;
    }

    public Business selectByCondition(Business business){
        String sql = "select * from business where businessName=?";
        Business ret = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,business.getBusinessName());
            rs = ps.executeQuery();
            if(rs.next()){
                ret = new Business();
                ret.setBusinessName(rs.getString("businessName"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }
        return ret;
    }

    public Business selectByNameAndPass(Business business){
        String sql = "select * from business where businessName=? and password=?";
        Business ret = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,business.getBusinessName());
            ps.setString(2,business.getPassword());
            rs = ps.executeQuery();
            if(rs.next()){
                ret = new Business();
                ret.setId(rs.getInt("id"));
                ret.setBusinessName(rs.getString("businessName"));
                ret.setPassword(rs.getString("password"));
                ret.setBusinessExplain(rs.getString("businessExplain"));
                ret.setAid(rs.getInt("aid"));
                ret.setUptime(rs.getTimestamp("uptime"));
                ret.setStarPrice(rs.getDouble("starPrice"));
                ret.setDeliveryPrice(rs.getDouble("deliveryPrice"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }
        return ret;
    }

    @Override
    public List<Business> selectAll() {
        String sql = "select * from business order by businessName DESC limit 0,10";
        List<Business> businessList =  new ArrayList<Business>();
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            Business temp = null;
            while (rs.next()){
                temp = new Business(
                        rs.getString("password"),
                        rs.getString("businessName"),
                        rs.getInt("aid")
                );
                temp.setId(rs.getInt("id"));
                temp.setBusinessExplain(rs.getString("businessExplain"));
                temp.setUptime(rs.getTimestamp("uptime"));
                temp.setStarPrice(rs.getDouble("starPrice"));
                temp.setDeliveryPrice(rs.getDouble("deliveryPrice"));
                temp.setBusinessAddress(rs.getString("businessAddress"));

                businessList.add(temp);
            }
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }
        return businessList;
    }

    @Override
    public Boolean insertSelective(Business obj) {
        String sql = "insert into business (businessName,password) values (?,?)";
        Boolean ret = false;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getBusinessName());
            ps.setString(2,obj.getPassword());
            int i = ps.executeUpdate();//增删改操作都是写入，select只读
            if(i > 0)
                ret = true;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }
        return ret;
    }

    @Override
    public Boolean updateSelective(Business obj) {
        return null;
    }
}
