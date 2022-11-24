package vip.epss.dao;

import vip.epss.pojo.Business;
import vip.epss.pojo.Food;
import vip.epss.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FoodDao implements DaoImpl<Food> {
    Connection conn=  DBUtils.getConn();
    PreparedStatement ps = null;
    ResultSet resultSet = null;

    @Override
    public Boolean deleteByPrimaryKey(Integer id) {
        return null;
    }

    public Boolean deleteByCondition(Food obj){
        return false;
    }

    @Override
    public Food selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public Food selectByPrimaryKeyWithObject(Integer id) {
        Food food = null;
        String sql  = "select\n" +
                "    f.id as fid,\n" +
                "    f.foodName as foodName,\n" +
                "    f.foodExplain as foodExplain,\n" +
                "    f.foodPrice as foodPrice,\n" +
                "    f.bid as bid,\n" +
                "    f.uptime as fuptime,\n" +
                "    b.businessName as businessName,\n" +
                "    b.businessExplain as businessExplain\n" +
                "from food as f\n" +
                "left join business as b\n" +
                "on f.bid = b.id\n" +
                "where f.id = ?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            resultSet = ps.executeQuery();
            if(resultSet.next()){
                Business business = new Business();
                food = new Food(
                        resultSet.getString("foodName"),
                        resultSet.getDouble("foodPrice"),
                        resultSet.getInt("bid")
                );
                food.setId(resultSet.getInt("fid"));
                food.setFoodExplain(resultSet.getString("foodExplain"));
                food.setUptime(resultSet.getTimestamp("fuptime"));
                business.setId(resultSet.getInt("bid"));
                business.setBusinessName(resultSet.getString("businessName"));
                business.setBusinessExplain(resultSet.getString("businessExplain"));
                food.setBusiness(business);
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            DBUtils.close(resultSet,ps,null);
        }
        return food;
    }

    @Override
    public List<Food> selectAll() {
        return null;
    }

    @Override
    public Boolean insertSelective(Food obj) {
        return null;
    }

    @Override
    public Boolean updateSelective(Food obj) {
        return null;
    }
}
