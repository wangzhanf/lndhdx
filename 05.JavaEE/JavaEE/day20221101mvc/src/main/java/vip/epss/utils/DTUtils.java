package vip.epss.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

//格式化处理时间的工具类
public class DTUtils {
    public static String formatDateTime(String parttern, Date src){
        //日期型的格式对象
        parttern = null == parttern ? "yyyy年MM月dd日" : parttern;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parttern);
        String format = simpleDateFormat.format(src);
        return format;
    }
}
