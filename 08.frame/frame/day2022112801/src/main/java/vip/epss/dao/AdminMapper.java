package vip.epss.dao;

public class AdminMapper implements CommonMapper{
    @Override
    public void selectByPrimaryKey(Integer id){
        System.out.println("Admin   dao 层的功能");
    }
}
