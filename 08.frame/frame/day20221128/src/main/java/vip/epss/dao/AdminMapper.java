package vip.epss.dao;

import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;

import java.util.List;
import java.util.Map;

public interface AdminMapper extends CommonMapper<Admin,AdminExample> {
    //以下11个基本方法每个mapper都拥有
//    Admin selectByPrimaryKey(Integer id);
//    List<Admin> selectByExample(AdminExample adminExample);










    Integer insertObj(Admin obj);
    List<Admin> selectByCondition(Admin obj);
}
