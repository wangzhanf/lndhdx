package vip.epss.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import vip.epss.domain.Admin;
import vip.epss.domain.AdminExample;
import vip.epss.service.AdminService;
import vip.epss.service.CommonService;
import vip.epss.utils.MessageAndData;

import java.util.List;

//完整版本的REST应用模式
//REST本质就是语义化HTTP方法，推荐使用资源（Admin，Food，Info）命名
//  http://localhost:8888/app/admins        GET     获取多个admin
//  http://localhost:8888/app/admins/3      GET     获取id为3的admin
//  http://localhost:8888/app/admins/3      DELETE  删除id为3的admin
//  http://localhost:8888/app/admins        POST    增加一个admin
//  http://localhost:8888/app/admins        PUT     修改一个admin
@RestController
@RequestMapping("/admins")
public class AdminFinalController implements CommonController<Admin>{

//    @Autowired
    @Qualifier("adminService")
//    @Resource
    @Autowired

    private AdminService adminService;

    @GetMapping("/{keyword}/{pageNum}/{pageSize}")
    public MessageAndData selectMultiple(
            @PathVariable(value = "keyword",required = false)String keyword,
            @PathVariable(value = "pageNum",required = true)Integer pageNum,
            @PathVariable(value = "pageSize",required = true)Integer pageSize
            ) {//查所有，按条件查，分页
        //初始化Pagehelper，拦截器需要介入
        PageHelper.startPage(pageNum,pageSize);
        AdminExample adminExample = null;
        if(keyword != ""){
            adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andAdminnameLike("%"+keyword+"%");
        }
        List<Admin> admins = adminService.selectByExample(adminExample);//没有条件查所有
        //使用PageHelper重新封装数据，封装为PageInfo【总记录数，是否有下一页】
        PageInfo<Admin> pageInfo = new PageInfo<>(admins, 7);
        return MessageAndData.success().addData("pageInfo",pageInfo);
    }

    @Override
    @GetMapping("{pk}")
    public MessageAndData selectOne(@PathVariable(value = "pk")Integer id) {
        Admin admin = adminService.selectByPrimaryKey(id);
        return MessageAndData.success().addData("admin",admin);
    }

    @Override
    @DeleteMapping("/{pk}")
    public MessageAndData deleteOne(@PathVariable(value = "pk")Integer id) {
        return CommonController.super.deleteOne(id);
    }

    @Override
    @PostMapping
    public MessageAndData add(Admin record) {
        return CommonController.super.add(record);
    }

    @Override
    @PutMapping
    public MessageAndData update(Admin record) {
        return CommonController.super.update(record);
    }
}
