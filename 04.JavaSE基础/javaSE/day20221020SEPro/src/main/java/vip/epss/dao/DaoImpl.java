package vip.epss.dao;

import vip.epss.pojo.Business;

import java.util.List;

public interface DaoImpl<T> {
    public abstract Boolean deleteByPrimaryKey(Integer id);
    T selectByPrimaryKey(Integer id);
    //程序已经开发了一段时间添加的功能，建议使用default默认方法定义接口
    default T selectByPrimaryKeyWithObject(Integer id){
        return null;
    }
    List<T> selectAll();
    Boolean insertSelective(T obj);
    Boolean updateSelective(T obj);

}
