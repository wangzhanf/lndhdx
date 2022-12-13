package vip.epss.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import vip.epss.domain.Business;
import vip.epss.service.IBusinessService;
import vip.epss.utils.MessageAndData;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商家表 前端控制器
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@RestController
@RequestMapping("/businesses")
public class BusinessController {

    @Autowired
//    @Resource
    private IBusinessService businessService;


    @GetMapping
    public MessageAndData all(){
        List<Business> list = businessService.list(null);
        return MessageAndData.success("获取所有商家信息成功",202).addData("list",list);
    }

}
