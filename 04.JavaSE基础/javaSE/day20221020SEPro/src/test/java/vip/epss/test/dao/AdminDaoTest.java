package vip.epss.test.dao;

import org.junit.Test;
import vip.epss.dao.AdminDao;
import vip.epss.pojo.Admin;

public class AdminDaoTest {
    @Test
    public void testSelectOne(){
        AdminDao adminDao = new AdminDao();
        Admin admin = adminDao.selectByPrimaryKey(1);
        System.out.println(admin);
        return;
    }

    @Test
    public void testSelectOneWithInfo(){
        AdminDao adminDao = new AdminDao();
        Admin admin = adminDao.selectByPrimaryKeyWithObject(1);
        System.out.println(admin);
        return;
    }

    @Test
    public void testSelectAll(){
        AdminDao adminDao = new AdminDao();
        for (Admin admin : adminDao.selectAll()) {
            System.out.println(admin);
        }
    }

    @Test
    public void testInsertOne(){
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin("zhangsan", "12345");
        Boolean aBoolean = adminDao.insertSelective(admin);
        System.out.println(aBoolean);
    }

    @Test
    public void testUpdate(){
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin("zhangsan", "888888");
        admin.setId(4);
        adminDao.updateSelective(admin);
    }

    @Test
    public void testDeleteOne(){
        AdminDao adminDao = new AdminDao();
        Boolean aBoolean = adminDao.deleteByPrimaryKey(4);
        System.out.println(aBoolean);
        return;
    }
}
