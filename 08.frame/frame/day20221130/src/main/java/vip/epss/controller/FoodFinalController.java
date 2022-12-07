package vip.epss.controller;

import org.springframework.web.bind.annotation.*;
import vip.epss.domain.Admin;
import vip.epss.domain.Food;
import vip.epss.utils.MessageAndData;


@RestController
@RequestMapping("/foods")
public class FoodFinalController implements CommonController<Food>{
    @Override
    @GetMapping
    public MessageAndData selectMultiple() {
        return MessageAndData.success().addData("key","value");
    }

    @Override
    @GetMapping("/{pk}")
    public MessageAndData selectOne(@PathVariable(value = "pk")Integer id) {
        return CommonController.super.selectOne(id);
    }

    @Override
    @DeleteMapping("/{pk}")
    public MessageAndData deleteOne(@PathVariable(value = "pk")Integer id) {
        return CommonController.super.deleteOne(id);
    }

    @Override
    @PostMapping
    public MessageAndData add(Food record) {
        return CommonController.super.add(record);
    }

    @Override
    @PutMapping
    public MessageAndData update(Food record) {
        return CommonController.super.update(record);
    }
}
