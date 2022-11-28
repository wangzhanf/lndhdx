package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;

@Repository(value = "adminMapper")
public interface AdminMapper extends CommonMapper<Admin,AdminExample> {

    //新增加的方法接口
    Admin selectByPrimaryKeyWithObject(Integer id);
}