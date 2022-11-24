package vip.epss.dao;

import vip.epss.domain.Business;
import vip.epss.domain.BusinessVO;

import java.util.List;

public interface BusinessMapper {
    public abstract Business selectByPrimaryKey(Integer id);
    List<Business> selectAll();
    public abstract Integer deleteByPrimaryKey(Integer id);
    Integer insertObj(Business obj);
    Integer updateObj(Business obj);

    Integer countNum();

    List<Business> selectByCondition(BusinessVO obj);
}
