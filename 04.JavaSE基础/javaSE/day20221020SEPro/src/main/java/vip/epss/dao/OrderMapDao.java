package vip.epss.dao;

import java.util.List;

public class OrderMapDao implements  DaoImpl{
    @Override
    public Boolean deleteByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public Object selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public Object selectByPrimaryKeyWithObject(Integer id) {
        return DaoImpl.super.selectByPrimaryKeyWithObject(id);
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public Boolean insertSelective(Object obj) {
        return null;
    }

    @Override
    public Boolean updateSelective(Object obj) {
        return null;
    }
}
