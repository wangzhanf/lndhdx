package vip.epss.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vip.epss.dao.AdminMapper;
import vip.epss.dao.BusinessMapper;
import vip.epss.dao.InfoMapper;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;
import vip.epss.domain.InfoExample;
import vip.epss.service.AdminService;
import vip.epss.service.BusinessService;

import java.util.List;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper ;
    @Autowired
    private InfoMapper infoMapper ;
    @Autowired
    private BusinessMapper businessMapper;
//    @Autowired
//    private SqlSessionFactory sqlSessionFactory;//IOC容器获取
//
//    @Override
//    public int deleteByPrimaryKey(Integer id){
//        //事务开始
//        System.out.println("AdminServiceImpl 的  deleteByPrimaryKey() 方法被调用了");
//        //adminMapper.deleteByPrimaryKey(id);
////        infoMapper.deleteByPrimaryKey(id);
//
//        //System.out.println(sqlSessionFactory);
//        SqlSession sqlSession = sqlSessionFactory.openSession(false);//获取了SqlSession时关闭自动提交，等同于JDBC编程中的Connection
////        sqlSession.commit();//关闭自动提交
//
//        //删info
//        InfoExample infoExample = new InfoExample();//Info的条件类
//        InfoExample.Criteria criteria = infoExample.createCriteria();
//        criteria.andAidEqualTo(id);
//        int i = infoMapper.deleteByExample(infoExample);
//
////        try{
////            int c = 0/0;//人为造异常  ， 数据出现不一致
////        }catch (Exception e){
////            e.printStackTrace();
////        }finally {
////            sqlSession.rollback();//事务回滚
////        }
//
//        //删admin
//        int j = adminMapper.deleteByPrimaryKey(id);
//        //成功则提交事务，失败则回滚事务
//        sqlSession.commit();//手工提交事务
//        return j;
//    }


    @Override
//    @Transactional
    public int deleteByPrimaryKey(Integer id){
        //事务开始,在spring配置文件中切入了事务处理机制
        System.out.println("AdminServiceImpl 的  deleteByPrimaryKey() 方法被调用了");

        //删info
        InfoExample infoExample = new InfoExample();//Info的条件类
        InfoExample.Criteria criteria = infoExample.createCriteria();
        criteria.andAidEqualTo(id);
        int i = infoMapper.deleteByExample(infoExample);

        //int c = 0/0;//人为造异常  ， 数据出现不一致

        //删admin
        int j = adminMapper.deleteByPrimaryKey(id);
        return j;
    }

    @Override
    public Admin selectByPrimaryKey(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        List<Admin> admins = adminMapper.selectByExample(example);
        return admins;
    }


    @Override
    public Admin loginCheck(Admin admin) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnameEqualTo(admin.getAdminname());
        criteria.andPasswordEqualTo(admin.getPassword());
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        Admin retadmin = null;
        if(admins.size() == 0)
            retadmin = null;
        if(admins.size() > 0)
            retadmin =  admins.get(0);

        return retadmin;
    }
}
