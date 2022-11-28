package vip.epss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vip.epss.dao.BusinessMapper;

//@Component(value = "businessService")
@Service(value = "businessService")  //推荐的形式  语义化
@Scope(value = "singleton")   //prototype
public class BusinessService {
    @Autowired
    @Qualifier("businessDao")
    private BusinessMapper businessMapper;//从IOC容器中自动注入

    public void selectOne(Integer id){
        System.out.println("Business service.....");
        businessMapper.selectByPrimaryKey(id);
    }
}
