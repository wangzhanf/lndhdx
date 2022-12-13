package vip.epss.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 食品表 前端控制器
 * </p>
 *
 * @author wangzhanf
 * @since 2022-12-12
 */
@RestController
@RequestMapping("/foods")
public class FoodController {

    @GetMapping
    public String welcome(){
        return "welcome food";
    }
}
