package vip.epss.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Food;
import vip.epss.domain.FoodExample;

import java.util.List;
@Repository(value = "foodMapper")
public interface FoodMapper  extends CommonMapper<Food, FoodExample> {

    //add new
    List<Food> selectByBid(Integer bid);

    @Select("select * from food where bid=#{bbbbbid}")
    List<Food> selectByBidByAnnotation(Integer bid);
}