package vip.epss.service;

import vip.epss.domain.BusinessVO;

import java.util.List;
import java.util.Map;

//通用的service层接口
public interface CommonService<T,E> {//类型参数
    public abstract Map<String,Object> queryAll(Integer startR, Integer pageSize, E vo);
    Integer deleteOne(Integer id);
    Integer addOne(T obj);
    Integer updateOne(T obj);

    T selectOne(Integer id);
}
