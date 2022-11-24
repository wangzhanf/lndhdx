package vip.epss.dao;

import vip.epss.domain.Admin;

import java.util.List;
import java.util.Map;

public interface AdminMapper {
    Integer insertObj(Admin obj);
    List<Admin> selectByCondition(Admin obj);
}
