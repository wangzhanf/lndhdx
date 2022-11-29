package vip.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.epss.dao.AdminMapper;
import vip.epss.dao.BusinessMapper;
import vip.epss.dao.InfoMapper;
import vip.epss.service.AdminService;
import vip.epss.service.BusinessService;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper ;
    @Autowired
    private InfoMapper infoMapper ;
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public int deleteByPrimaryKey(Integer id){
        //事务开始
        System.out.println("AdminServiceImpl 的  deleteByPrimaryKey() 方法被调用了");
        adminMapper.deleteByPrimaryKey(id);
//        infoMapper.deleteByPrimaryKey(id);
        //删订单
        //删食品
        //删商家
        //成功则提交事务，失败则回滚事务
        return 8;
    }
}
