import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import vip.epss.dao.BusinessDao;
import vip.epss.pojo.Business;

import java.io.IOException;
import java.io.Reader;

public class BusinessDaoTest {

    @Test
    public void testSelectByPrimaryKey() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessDao mapper = sqlSession.getMapper(BusinessDao.class);
        //使用mapper执行具体方法
        Business business = mapper.selectByPrimaryKey(1018);
        //输出
        System.out.println(business);
        return;
    }

    @Test
    public void testDeleteByPrimaryKey() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessDao mapper = sqlSession.getMapper(BusinessDao.class);
        //使用mapper执行具体方法
        int i = mapper.deleteByPrimaryKey(14);
        //输出
        System.out.println(i);
        return;
    }

    @Test
    public void testInsert() throws IOException {
        //挖矿获得资金
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis.xml");
        //使用资金雇佣工人建造工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //使用工厂生产产品 sqlSession   等同于   connection ，true代表  autocommit
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取对应的mapper
        BusinessDao mapper = sqlSession.getMapper(BusinessDao.class);
        //使用mapper执行具体方法
        int i = mapper.insertObj(new Business("12345", "花甲粉"));
        //输出
        System.out.println(i);
        return;
    }

}
