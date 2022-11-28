package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;
import vip.epss.domain.Info;
import vip.epss.domain.InfoExample;
@Repository(value = "infoMapper")
public interface InfoMapper  extends CommonMapper<Info, InfoExample> {

    //add new

    Info selectByPrimaryKeyWithObject(Integer id);
}