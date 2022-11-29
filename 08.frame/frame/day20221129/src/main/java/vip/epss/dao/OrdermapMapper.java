package vip.epss.dao;

import org.springframework.stereotype.Repository;
import vip.epss.domain.Ordermap;
import vip.epss.domain.OrdermapExample;


@Repository(value = "ordermapMapper")
public interface OrdermapMapper  extends CommonMapper<Ordermap, OrdermapExample> {

}