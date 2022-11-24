package vip.epss.test.dao;

import org.junit.Test;
import vip.epss.dao.FoodDao;
import vip.epss.pojo.Food;

public class FoodDaoTest {

    @Test
    public void testFoodWithObj(){
        FoodDao foodDao = new FoodDao();
        Food food = foodDao.selectByPrimaryKeyWithObject(1);
        System.out.println(food);
    }
}
