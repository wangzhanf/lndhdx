package vip.epss.service.impl;

import vip.epss.domain.Business;
import vip.epss.mapper.BusinessMapper;
import vip.epss.service.IBusinessService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商家表 服务实现类
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements IBusinessService {

}
