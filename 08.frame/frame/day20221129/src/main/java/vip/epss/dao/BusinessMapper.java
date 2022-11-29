package vip.epss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessExample;

import java.util.List;
@Mapper
public interface BusinessMapper  extends CommonMapper<Business, BusinessMapper>{


    //add new

    List<Business> selectByExampleWithObject(BusinessExample example);
    List<Business> selectByExampleWithObject1(BusinessExample example);
}