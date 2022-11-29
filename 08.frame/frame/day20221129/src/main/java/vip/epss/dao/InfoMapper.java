package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.Info;
import vip.epss.domain.InfoExample;
@Repository(value = "infoMapper")
public interface InfoMapper  extends CommonMapper<Info, InfoExample> {

    //add new

    Info selectByPrimaryKeyWithObject(Integer id);
}