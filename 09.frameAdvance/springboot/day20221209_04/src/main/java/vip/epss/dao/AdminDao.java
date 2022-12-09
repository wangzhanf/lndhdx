package vip.epss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Admin;

import java.util.List;

//@Component
//@Repository
@Mapper
public interface AdminDao {
    @Select("select * from admin where id=#{vvvvvvvvaaaall}")
    Admin selectByPrimaryKey(Integer id);

    @Select("select * from admin")
    List<Admin> selectByExample();
}
