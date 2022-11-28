package vip.epss.dao;

public class FoodMapper implements CommonMapper{
    @Override
    public void selectByPrimaryKey(Integer id){
        System.out.println("Food   dao 层的功能");
    }
}
