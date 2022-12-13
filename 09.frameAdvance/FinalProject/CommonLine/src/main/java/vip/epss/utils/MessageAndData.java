package vip.epss.utils;
//通用的数据封装格式

import java.util.HashMap;
import java.util.Map;

public class MessageAndData {
    private String message;//说明信息
    private Integer statusCode;//状态码
    //仿照通信协议实现  1xx 协商，  2xx 成功，3xx  重定向，  4xx  访问资源 ，5xx  服务器问题
    private Map<String,Object> dataZone = new HashMap<>();//万能容器

    public Map<String, Object> getDataZone() {
        return dataZone;
    }

    public MessageAndData setDataZone(Map<String, Object> dataZone) {
        this.dataZone = dataZone;
        return  this;
    }

    public String getMessage() {
        return this.message;
    }

    public MessageAndData setMessage(String message) {
        this.message = message;
        return  this;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MessageAndData setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return  this;
    }

    //作为一个工具类，应该要方便调用，使用类方法static比较合适
    public static MessageAndData success(String msg){
        return success().setMessage(msg);
    }
    public static MessageAndData success(Integer sc){
        return success().setStatusCode(sc);
    }
    public static MessageAndData success(String msg,Integer sc){
        return success(msg).setStatusCode(sc);
    }
    public static MessageAndData success(){//工厂方法
        MessageAndData messageAndData = new MessageAndData();
        messageAndData.setStatusCode(200);
        messageAndData.setMessage("成功");
        return messageAndData;
    }
    public static MessageAndData error(String msg){
        MessageAndData messageAndData = error();
        messageAndData.setMessage(msg);
        return messageAndData;
    }
    public static MessageAndData error(Integer sc){
        MessageAndData messageAndData = error();
        messageAndData.setStatusCode(sc);
        return messageAndData;
    }
    public static MessageAndData error(String msg,Integer sc){
        MessageAndData messageAndData = error(msg);
        messageAndData.setStatusCode(sc);
        return messageAndData;
    }
    public static MessageAndData error(){//工厂方法
        MessageAndData messageAndData = new MessageAndData();
        messageAndData.setStatusCode(404);
        messageAndData.setMessage("失败");
        return messageAndData;
    }

    public MessageAndData addData(String keyname,Object val){
        dataZone.put(keyname,val);
        return this;//支持链式编程
    }
}
