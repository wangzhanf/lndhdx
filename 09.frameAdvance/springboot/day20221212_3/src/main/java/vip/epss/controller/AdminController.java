package vip.epss.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.epss.dao.AdminDao;
import vip.epss.domain.Admin;

import javax.annotation.Resource;

@RestController
@RequestMapping("admins")
public class AdminController {

    @Autowired
//    @Resource
    private AdminDao adminDao;


    @GetMapping("/{keyword}/{pageNum}/{pageSize}")
    public String testByPageAndExample(
            @PathVariable("keyword")String keyword,
            @PathVariable("pageNum")Integer pageNum,
            @PathVariable("pageSize")Integer pageSize
    ){

        //解决分页问题
        //1 创建分页的条件
        IPage<Admin> adminPage = new Page<>(pageNum, pageSize);
        //2 携带分页条件进行查询
        //3.1 构造查询的条件对象
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        //3.2   条件对象赋予条件值
        adminQueryWrapper.like("adminname",keyword); //无需手工拼接  %

        IPage<Admin> iPage = adminDao.selectPage(adminPage, adminQueryWrapper);


        System.out.println(iPage.getRecords());
        System.out.println(iPage.getPages());


        //返回给客户端
        return iPage.getRecords().toString();


    }
}
