package vip.epss.service;

import java.io.IOException;
import java.util.List;

public interface CommonService<T,E> {
    int deleteByPrimaryKey(Integer id);
    T selectByPrimaryKey(Integer id);

    List<T> selectByExample(E example);
}
