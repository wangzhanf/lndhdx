package vip.epss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.CommonMapper;
import vip.epss.dao.FoodMapper;
import vip.epss.dao.OrdermapMapper;

@Service(value = "businessService")
public class BusinessServiceImpl implements CommonService {

    @Autowired
    private CommonMapper ordermapMapper;
    @Autowired
    private CommonMapper foodMapper;
    @Autowired
    private CommonMapper businessMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        //判断数据的有效性
        if(id < 1 || id > Integer.MAX_VALUE)
            return 0;
        //删除订单  ordermap
        ordermapMapper.deleteByExample(null);
        //删除食品  food
        foodMapper.deleteByExample(null);
        //删除商家  business
        businessMapper.deleteByPrimaryKey(id);
        return 0;
    }
}
