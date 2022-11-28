package vip.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vip.epss.domain.Ordermap;
import vip.epss.domain.OrdermapExample;

public interface OrdermapMapper {
    int countByExample(OrdermapExample example);

    int deleteByExample(OrdermapExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ordermap record);

    int insertSelective(Ordermap record);

    List<Ordermap> selectByExample(OrdermapExample example);

    Ordermap selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ordermap record, @Param("example") OrdermapExample example);

    int updateByExample(@Param("record") Ordermap record, @Param("example") OrdermapExample example);

    int updateByPrimaryKeySelective(Ordermap record);

    int updateByPrimaryKey(Ordermap record);
}