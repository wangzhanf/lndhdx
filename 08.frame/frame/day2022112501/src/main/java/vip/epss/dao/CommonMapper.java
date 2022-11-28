package vip.epss.dao;

import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;

import java.util.List;

public interface CommonMapper<T,TE> {
    int countByExample(TE example);

    int deleteByExample(TE example);

    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(TE example);

    T selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") TE example);

    int updateByExample(@Param("record") T record, @Param("example") TE example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}