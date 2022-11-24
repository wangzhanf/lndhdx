package vip.epss.service;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import vip.epss.dao.BusinessDao;
import vip.epss.dao.FoodDao;
import vip.epss.dao.OrderMapDao;
import vip.epss.pojo.Business;
import vip.epss.pojo.Food;

import java.util.List;

public class BusinessService {
    private BusinessDao businessDao = new BusinessDao();
    private FoodDao foodDao = new FoodDao();
    private OrderMapDao orderMapDao = new OrderMapDao();

    //注册新商家
    public String registerNew(String na,String pass,String repass){
        String msg = "";
        //组装数据
        if(na.length()==0||pass.length()==0||repass.length()==0||!pass.equals(repass)){
            msg = "注册消息有误";
        }else{
            //业务整合
            //查询是否存在同名用户
            Business business = new Business();
            business.setBusinessName(na);
            if(businessDao.selectByCondition(business) == null){//可以注册
                //插入新商家
                business.setPassword(pass);//安全考虑
                Boolean aBoolean = businessDao.insertSelective(business);
                if(aBoolean){
                    msg = "恭喜，注册成功";
                }else{
                    msg = "数据插入失败";
                }
            }else{
                msg = "用户名已存在";
            }
        }
        //返回状态
        return msg;
    }

    public Business loginCheck(String name,String pass){
        String msg = "";
        Business in = new Business(pass,name,null);
        Business business = businessDao.selectByNameAndPass(in);
        return business;
    }

    //删除某个商家
    public String removeOne(Integer id){
        String msg = "";
//        //Boolean aBoolean = businessDao.deleteByPrimaryKey1(id);
//        lists = foodDao.selectByCondition(id);//bid
//        orderMapDao.deleteByList(lists);
//        foodDao.deleteByCondition(new Food());
        Boolean aBoolean = businessDao.deleteByPrimaryKey1(id);
//        Boolean aBoolean = businessDao.deleteByPrimaryKey(id);

        return msg = aBoolean?"成功":"失败";
    }

    public List<Business> selectAll(){
        List<Business> businesses = businessDao.selectAll();
        return businesses;
    }

}
