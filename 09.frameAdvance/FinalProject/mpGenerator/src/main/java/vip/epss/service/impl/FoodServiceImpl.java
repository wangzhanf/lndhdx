package vip.epss.service.impl;

import vip.epss.domain.Food;
import vip.epss.mapper.FoodMapper;
import vip.epss.service.IFoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 食品表 服务实现类
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements IFoodService {

}
