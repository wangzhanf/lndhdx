package vip.epss.dao;

import vip.epss.domain.Business;
import vip.epss.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusinessDao implements CommonDao<Business> {
    private Connection conn = DBUtils.getConn();
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public Integer count(String condition){
        Integer num = 0;
        String sql = "select count(id) as num  from business " + condition;
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
    public List<Business> selectAll(Integer startR,Integer pageSize,String condition) {
        List<Business> businessList =  new ArrayList<>();
        String sql = "select * from business " + condition + " order by id DESC limit ?,?";
        System.out.println(sql);
        try{
            this.ps  = this.conn.prepareStatement(sql);
            ps.setInt(1,startR);
            ps.setInt(2,pageSize);
            this.rs = ps.executeQuery();
            while (rs.next()){
                businessList.add(
                    new Business(
                            rs.getString("password"),
                            rs.getString("businessName")
                    ).setId(rs.getInt("id")).
                            setBusinessAddress(rs.getString("businessAddress")).
                            setBusinessExplain(rs.getString("businessExplain")).
                            setStarPrice(rs.getDouble("starPrice")).
                            setDeliveryPrice(rs.getDouble("deliveryPrice")).
                            setAid(rs.getInt("aid")).
                            //setAdmin(rs.getInt("aid")).
                            setUptime(rs.getTimestamp("uptime"))
                );
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        return businessList;
    }

    @Override
    public Business selectByPrimaryKey(Integer id) {
        Business business = new Business();
        String sql = "select * from business where id=?";
        try{
            this.ps  = this.conn.prepareStatement(sql);
            this.ps.setInt(1,id);
            this.rs = ps.executeQuery();
            if(rs.next()){
                business = new Business(
                                rs.getString("password"),
                                rs.getString("businessName")
                        ).setId(rs.getInt("id")).
                                setBusinessAddress(rs.getString("businessAddress")).
                                setBusinessExplain(rs.getString("businessExplain")).
                                setStarPrice(rs.getDouble("starPrice")).
                                setDeliveryPrice(rs.getDouble("deliveryPrice")).
                                setAid(rs.getInt("aid")).
                                //setAdmin(rs.getInt("aid")).
                                        setUptime(rs.getTimestamp("uptime"));

            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(rs,ps,null);
        }

        return business;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        String sql = "delete from business where id=?";
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
    public int insertSelective(Business obj) {
        String sql = "insert into business (businessName,password,businessExplain,businessAddress) values (?,?,?,?)";
        int i = 0;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getBusinessName());
            ps.setString(2,obj.getPassword());
            ps.setString(3,obj.getBusinessExplain());
            ps.setString(4,obj.getBusinessAddress());
            i = ps.executeUpdate();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return i;
    }

    @Override
    public int updateSelective(Business obj) {
        String sql = "update business set businessName=?,password=?,businessExplain=?,aid=? where id=?";
        int i = 0;
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,obj.getBusinessName());
            ps.setString(2,obj.getPassword());
            ps.setString(3,obj.getBusinessExplain());
            ps.setInt(4,obj.getAid());
            ps.setInt(5,obj.getId());
            i = ps.executeUpdate();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(null,ps,null);
        }
        return i;
    }
}
