package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessExample;
@Repository(value = "businessMapper")
public interface BusinessMapper  extends CommonMapper<Business, BusinessMapper>{


    //add new

    List<Business> selectByExampleWithObject(BusinessExample example);
    List<Business> selectByExampleWithObject1(BusinessExample example);
}