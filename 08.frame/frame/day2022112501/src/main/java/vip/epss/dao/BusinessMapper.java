package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessExample;

public interface BusinessMapper extends CommonMapper<Business,BusinessExample>{
    //add new

    List<Business> selectByExampleWithObject(BusinessExample example);
    List<Business> selectByExampleWithObject1(BusinessExample example);
}