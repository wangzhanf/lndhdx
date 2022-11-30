package vip.epss.dao;

import org.apache.ibatis.annotations.Mapper;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;

@Mapper
public interface AdminMapper extends CommonMapper<Admin,AdminExample> {

    //新增加的方法接口
    Admin selectByPrimaryKeyWithObject(Integer id);
}