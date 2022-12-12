package vip.epss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.epss.domain.Admin;

public interface AdminDao extends BaseMapper<Admin> {
    //需要添加特性方法，通用的方法都被封装在BaseMapper
}
