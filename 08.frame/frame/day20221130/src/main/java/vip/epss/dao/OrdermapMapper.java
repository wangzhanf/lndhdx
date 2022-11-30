package vip.epss.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import vip.epss.domain.Ordermap;
import vip.epss.domain.OrdermapExample;


@Mapper
public interface OrdermapMapper  extends CommonMapper<Ordermap, OrdermapExample> {

}