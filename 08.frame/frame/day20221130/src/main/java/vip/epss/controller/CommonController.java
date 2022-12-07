package vip.epss.controller;

import org.springframework.web.bind.annotation.*;
import vip.epss.domain.Admin;
import vip.epss.utils.MessageAndData;

public interface CommonController<T> {

    default public MessageAndData selectMultiple(){//获得多个资源
        return null;
    }

    default public MessageAndData selectOne(@PathVariable(value = "pk")Integer id){//获得1个资源,按主键获取
        return null;
    }

    default public MessageAndData deleteOne(@PathVariable(value = "pk")Integer id){//删除1个资源,按主键删除
        return null;
    }

    default public MessageAndData add(/*@RequestParam(value = "obj",required = true)*/T record){//添加资源
        return null;
    }

    default public MessageAndData update(T record){//修改资源
        return null;
    }

}
