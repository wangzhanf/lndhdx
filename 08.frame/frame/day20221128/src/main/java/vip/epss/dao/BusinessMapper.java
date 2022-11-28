package vip.epss.dao;

import vip.epss.domain.*;

import java.util.List;

public interface BusinessMapper {
    Business selectByPrimaryKey(Integer id);
    List<Business> selectByExample(BusinessExample adminExample);





    List<Business> selectAll();
    public abstract Integer deleteByPrimaryKey(Integer id);
    Integer insertObj(Business obj);
    Integer updateObj(Business obj);

    Integer countNum();

    List<Business> selectByCondition(BusinessVO obj);
}
