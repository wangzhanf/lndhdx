package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Info;
import vip.epss.domain.InfoExample;

public interface InfoMapper extends CommonMapper<Info,InfoExample> {
    //add new

    Info selectByPrimaryKeyWithObject(Integer id);
}