package vip.epss.service;

import vip.epss.dao.AdminDao;
import vip.epss.dao.BusinessDao;
import vip.epss.dao.CommonDao;
import vip.epss.dao.InfoDao;
import vip.epss.domain.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminServiceImpl implements CommonService<Admin, AdminVO>{
    private CommonDao<Admin> commonDao = new AdminDao();
    private InfoDao infoCommonDao = new InfoDao();

    @Override
    public Map<String,Object> queryAll(Integer startR, Integer pageSize, AdminVO vo) {
        String condition = " where 1=1 ";
        //拼接条件
        if(vo == null){
            System.out.println("没有搜索条件");
        }else{
            if(vo.getCon() != null && vo.getId()!=null){
                String symbol=  "";
                switch (vo.getCon()){
                    case "大于":symbol = ">";break;
                    case "等于":symbol = "=";break;
                    case "小于":symbol = "<";break;
                }
                condition += " and a.id" + symbol + vo.getId() + " ";
            }
            if(vo.getAdminName() != null){
                condition += " and a.adminName like '%" + vo.getAdminName() +"%' ";
            }
        }


        Integer count = commonDao.count(condition);
        List<Admin> adminList = commonDao.selectAll(startR, pageSize,condition);
        //返回多个：1    MessageAndData，2    集合框架  map，3 分页信息类组装数据
        Map<String, Object> content = new HashMap<>();
        content.put("startNum",startR);
        content.put("pageSize",pageSize);
        content.put("total",count);
        content.put("pageListLength",5);
        content.put("list",adminList);
        return content;
    }

    @Override
    public Integer deleteOne(Integer id) {
        //整合业务，先删订单，再删食品，再删商家
        infoCommonDao.deleteByExample(id);
        int i = commonDao.deleteByPrimaryKey(id);

        return i;
    }

    @Override
    public Integer addOne(Admin obj) {
        int i = commonDao.insertSelective(obj);
        return i;
    }

    @Override
    public Integer updateOne(Admin obj) {
        infoCommonDao.updateSelective(obj.getInfo());
        int i = commonDao.updateSelective(obj);
        return i;
    }

    @Override
    public Admin selectOne(Integer id) {
        return commonDao.selectByPrimaryKey(id);
    }

    public Admin loginOpt(Admin admin){
        return ((AdminDao)commonDao).matchUandP(admin);
    }
}
