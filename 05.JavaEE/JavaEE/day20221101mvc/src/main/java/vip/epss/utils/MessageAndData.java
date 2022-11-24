package vip.epss.utils;

import java.util.HashMap;
import java.util.Map;

public class MessageAndData {
    private Integer statusCode;
    private String message;
    private Map<String,Object> dataZone = new HashMap<>();

    public static MessageAndData success(){
        MessageAndData messageAndData = new MessageAndData();
        messageAndData.setStatusCode(200);
        messageAndData.setMessage("成功");
        return messageAndData;
    }

    public static MessageAndData success(String message){
        MessageAndData messageAndData = success();
        messageAndData.setMessage(message);
        return messageAndData;
    }
    public static MessageAndData error(){
        MessageAndData messageAndData = new MessageAndData();
        messageAndData.setStatusCode(400);
        messageAndData.setMessage("失败");
        return messageAndData;
    }

    public static MessageAndData error(String message){
        MessageAndData messageAndData = error();
        messageAndData.setMessage(message);
        return messageAndData;
    }

    public MessageAndData add(String key,Object value){
        this.dataZone.put(key, value);
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getDataZone() {
        return dataZone;
    }

    public void setDataZone(Map<String, Object> dataZone) {
        this.dataZone = dataZone;
    }
}
