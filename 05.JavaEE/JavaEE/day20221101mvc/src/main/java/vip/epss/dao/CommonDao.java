package vip.epss.dao;

import java.util.List;

public interface CommonDao<T> {
    public abstract List<T> selectAll(Integer startR,Integer pageSize,String c);
    public abstract T selectByPrimaryKey(Integer id);
    public abstract int deleteByPrimaryKey(Integer id);
    public abstract int insertSelective(T obj);
    public abstract int updateSelective(T obj);
    public Integer count(String c);
}
