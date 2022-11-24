package vip.epss.service;

import vip.epss.dao.BusinessDao;
import vip.epss.dao.CommonDao;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessServiceImpl implements CommonService<Business,BusinessVO> {
    private CommonDao<Business> commonDao = new BusinessDao();
    @Override
    public Map<String,Object> queryAll(Integer startR, Integer pageSize, BusinessVO bvo) {
        String condition = " where 1=1 ";
        //拼接条件
        if(bvo == null){
            System.out.println("没有搜索条件");
        }else{
            if(bvo.getCon() != null && bvo.getId()!=null){
                String symbol=  "";
                switch (bvo.getCon()){
                    case "大于":symbol = ">";break;
                    case "等于":symbol = "=";break;
                    case "小于":symbol = "<";break;
                }
                condition += " and id" + symbol + bvo.getId() + " ";
            }
            if(bvo.getBusinessName() != null){
                condition += " and businessName like '%" + bvo.getBusinessName() +"%' ";
            }
        }
        //where 1=1 and id < 999 and businessName like %羊肉%
//        condition += "where id " +bvo.getCon() +bvo.getId()
//        and bname like %bvo.getBusinessName()%

        Integer count = commonDao.count(condition);
        List<Business> businessList = commonDao.selectAll(startR, pageSize,condition);
        //返回多个：1    MessageAndData，2    集合框架  map，3 分页信息类组装数据
        Map<String, Object> content = new HashMap<>();
        content.put("startNum",startR);
        content.put("pageSize",pageSize);
        content.put("total",count);
        content.put("pageListLength",5);
        content.put("list",businessList);
        return content;
    }

    @Override
    public Integer deleteOne(Integer id) {
        //整合业务，先删订单，再删食品，再删商家

        int i = commonDao.deleteByPrimaryKey(id);

        return i;
    }

    @Override
    public Integer addOne(Business obj) {
        int i = commonDao.insertSelective(obj);
        return i;
    }

    @Override
    public Integer updateOne(Business obj) {
        int i = commonDao.updateSelective(obj);
        return i;
    }

    @Override
    public Business selectOne(Integer id) {
        return commonDao.selectByPrimaryKey(id);
    }


}
