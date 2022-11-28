import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import vip.epss.dao.AdminMapper;
import vip.epss.dao.BusinessMapper;
import vip.epss.dao.InfoMapper;
import vip.epss.domain.Admin;
import vip.epss.domain.Business;
import vip.epss.domain.BusinessVO;
import vip.epss.domain.Info;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testSelectByPrimaryKey() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        Business business = mapper.selectByPrimaryKey(1018);
        //输出
        System.out.println(business);
        return;
    }

    @Test
    public void testDeleteByPrimaryKey() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        int i = mapper.deleteByPrimaryKey(14);
        //输出
        System.out.println(i);
        return;
    }

    @Test
    public void testInsert() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        int i = mapper.insertObj(new Business("12345", "花甲粉"));
        //输出
        System.out.println(i);
        return;
    }

    @Test
    public void testUpdate() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        Business newB = new Business("12345", "花甲粉999");
        newB.setId(6);
        int i = mapper.updateObj(newB);
        //输出
        System.out.println(i);
        return;
    }

    @Test
    public void testSelectAll() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        List<Business> businessList = mapper.selectAll();
        //输出
        for (Business temp:businessList) {
            System.out.println(temp);
        }
        return;
    }

    @Test
    public void testCount() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        Integer integer = mapper.countNum();
        //输出
        System.out.println("总记录数："+ integer);
        return;
    }



    @Test
    public void testInsertRetKey() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        InfoMapper infoMapper = sqlSession.getMapper(InfoMapper.class);
        //使用mapper执行具体方法
        Info info = new Info();
        info.setPhone("119119119");

        Admin admin = new Admin();
        admin.setAdminName("lisi");
        admin.setPassword("999999");
        admin.setInfo(info);

        System.out.println("before:" + admin);
        Integer i = mapper.insertObj(admin);
        admin.getInfo().setAid(admin.getId());

        infoMapper.insertObj(admin.getInfo());

        System.out.println("after:" + admin);
        //输出
        System.out.println("影响记录数："+ i);
        return;
    }


    @Test
    public void testAdminQuerySimple() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        //使用mapper执行具体方法
        Admin admin = new Admin();//用以封装查询条件
        admin.setId(1);
        admin.setAdminName("a");
        List<Admin> adminList = mapper.selectByCondition(admin);
        //输出
        System.out.println(adminList);
        return;
    }


    @Test
    public void testSelectCondition() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatisConfig.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessMapper mapper = sqlSession.getMapper(BusinessMapper.class);
        //使用mapper执行具体方法
        BusinessVO businessVO = new BusinessVO();
        businessVO.setCon(">");
        businessVO.setId(8);
        businessVO.setBusinessName("e");
        List<Business> businessList = mapper.selectByCondition(businessVO);
        //输出
        for (Business temp:businessList) {
            System.out.println(temp);
        }
        return;
    }

}
