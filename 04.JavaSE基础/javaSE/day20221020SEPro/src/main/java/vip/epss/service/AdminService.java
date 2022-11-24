package vip.epss.service;

import vip.epss.dao.AdminDao;
import vip.epss.pojo.Admin;

import java.util.Date;

//Admin相关的业务整合
public class AdminService {
    private AdminDao adminDao = new AdminDao();

    //登录
    public String loginCheck(String name,String pass){
        String message = "";
        //将用户输入散碎数据组装为对象，方便传递
        if(name.length() == 0 || pass.length() == 0){
            message = "用户名或密码都不能为空";
        }else{
            Admin admin = new Admin(name, pass);
            //调用Dao层接口执行SQL
            Admin ret = adminDao.selectByCondition(admin);
            //根据Dao层返回组装状态信息
            if(ret == null){
                message = "用户名和密码不匹配";
            }else{
                Date date = new Date();
                System.out.println(ret.getUptime().getTime());
                System.out.println(date.getTime());
                long day = (date.getTime() - ret.getUptime().getTime()) / (1000 * 60 * 60 * 24);
                Date in = new Date();
                message = "恭喜您，您已经称为会员"+day+"天";
            }
        }
        return message;
    }

    //注册  课间休息   10：40

    //登出
}
