package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import vip.epss.domain.Food;
import vip.epss.domain.FoodExample;

public interface FoodMapper extends CommonMapper<Food,FoodExample> {

    //add new
    List<Food> selectByBid(Integer bid);

    @Select("select * from food where bid=#{bbbbbid}")
    List<Food> selectByBidByAnnotation(Integer bid);
}