package vip.epss.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.epss.domain.Admin;
import vip.epss.service.impl.AdminServiceImpl;
import vip.epss.utils.MessageAndData;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@RestController
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    private AdminServiceImpl adminService;

//    @GetMapping("/welcome")
//    public String welcome(){
//        return "welcome admin";
//    }

    @GetMapping
    public MessageAndData all(){
        Page<Admin> adminPage = new Page<>(2,5);
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        adminQueryWrapper.likeLeft("adminName","adm");
        Page<Admin> page = adminService.page(adminPage, adminQueryWrapper);
        return MessageAndData.success().addData("page",page);
    }
}
