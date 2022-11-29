package vip.epss.service.impl;

import org.springframework.stereotype.Service;
import vip.epss.service.BusinessService;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
@Service(value = "businessService")
public class BusinessServiceImpl implements BusinessService {
    @Override
    public int deleteByPrimaryKey(Integer id){
        //事务开始
        System.out.println("BusinessServiceImpl 的  deleteByPrimaryKey() 方法被调用了");
        //删订单
        //删食品
        //删商家
        //成功则提交事务，失败则回滚事务
        return 9;
    }
}
