package vip.epss.service.impl;

import vip.epss.domain.Info;
import vip.epss.mapper.InfoMapper;
import vip.epss.service.IInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 详细信息表 服务实现类
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {

}
