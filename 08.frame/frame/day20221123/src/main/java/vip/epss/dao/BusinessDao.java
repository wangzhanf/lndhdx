package vip.epss.dao;

import vip.epss.pojo.Business;


public interface BusinessDao {
    public abstract Business selectByPrimaryKey(Integer id);
    public abstract int deleteByPrimaryKey(Integer id);
    int insertObj(Business obj);
}
