package vip.epss.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import vip.epss.domain.Admin;
import vip.epss.mapper.AdminMapper;
import vip.epss.service.IAdminService;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
