package vip.epss.dao;

import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;

import java.util.List;
//抽象的接口，推荐使用泛型
public interface CommonMapper<T,E> {
    T selectByPrimaryKey(Integer pk);
    List<T> selectByExample(E example);
}
