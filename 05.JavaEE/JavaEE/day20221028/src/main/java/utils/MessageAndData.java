package utils;
//返回给前端的标准格式包
//        ## 1	仅关注返回是否正确，标识表示   类似  404和200
//        ## 2	返回的数据应该是没有限制的，弹性增长的
//        ## 3	方便组装，static

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MessageAndData implements Serializable {
    private MessageAndData(){}
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

    private Integer statusCode;//404,200
    private String message;//提示信息文字
    private Map<String,Object> dataZone = new HashMap<>();

    public static MessageAndData success(){
        String msg = "成功完成";
        return success(msg);
    }
    public static MessageAndData success(String msg){
        MessageAndData mad = new MessageAndData();
        mad.statusCode = 200;
        mad.message = msg;
        return mad;
    }
    public static MessageAndData error(){
        String msg = "出现错误";
        return error(msg);
    }
    public static MessageAndData error(String msg){
        MessageAndData mad = new MessageAndData();
        mad.statusCode = 400;
        mad.message = msg;
        return mad;
    }

    public MessageAndData addData(String key,Object obj){
        dataZone.put(key,obj);
        return this;
    }
}
//   MessageAndData.success().addData("userlist",uLists).addData()
//   MessageAndData.error()
