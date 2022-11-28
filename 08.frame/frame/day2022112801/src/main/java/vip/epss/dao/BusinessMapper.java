package vip.epss.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component(value = "businessMapper")  //将该类产生的对象放在IOC容器中
@Repository(value = "businessDao") //推荐的形式，语义化   ,  演示 根据名字注入
public class BusinessMapper implements CommonMapper{
    @Override
    public void selectByPrimaryKey(Integer id) {
        System.out.println("Business mapper....................");
    }
}
