package vip.epss.test.dao;

import org.junit.Test;
import vip.epss.dao.AdminDao;
import vip.epss.dao.BusinessDao;
import vip.epss.pojo.Admin;

public class BusinessDaoTest {

    @Test
    public void testDeleteOne(){
        BusinessDao businessDao = new BusinessDao();
        Boolean aBoolean = businessDao.deleteByPrimaryKey1(1);
        System.out.println(aBoolean);
        return;
    }
}
