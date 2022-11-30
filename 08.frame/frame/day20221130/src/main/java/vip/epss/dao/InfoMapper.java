package vip.epss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Info;
import vip.epss.domain.InfoExample;
@Mapper
public interface InfoMapper  extends CommonMapper<Info, InfoExample> {

    //add new

    Info selectByPrimaryKeyWithObject(Integer id);
}