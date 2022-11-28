package vip.epss.service;

import vip.epss.dao.AdminMapper;
import vip.epss.dao.CommonMapper;
import vip.epss.dao.FoodMapper;

public class AdminService {
//    private AdminMapper adminMapper = new AdminMapper();
//    private FoodMapper foodMapper =  new FoodMapper();//不想new
    private FoodMapper foodMapper;//不想new
//    private AdminMapper adminMapper = new AdminMapper();
    private AdminMapper adminMapper;

    public FoodMapper getFoodMapper() {
        return foodMapper;
    }

    public void setFoodMapper(FoodMapper foodMapper) {
        this.foodMapper = foodMapper;
    }

    public AdminMapper getAdminMapper() {
        return adminMapper;
    }

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    //查询某个数据
    public void selectOne(Integer id){
        System.out.println("service层实现");
        adminMapper.selectByPrimaryKey(id);
    }

    //测试方法，也是Controller的体现
    public static void main(String[] args) {
        AdminService adminService = new AdminService();
        adminService.selectOne(55);
    }
}
