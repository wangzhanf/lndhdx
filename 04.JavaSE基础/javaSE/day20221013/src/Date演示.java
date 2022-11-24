//导入包
import java.util.Date;
public class Date演示 {
    public static void main(String[] args) {
        /*Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(178900456);
        System.out.println(date1);*/
        Date start = new Date();
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
            System.out.println(i);
        }
        Date end = new Date();
        System.out.println("结果是：" + sum);
//        int total = end.getMinutes() - start.getMinutes();
        long total = end.getTime() - start.getTime();
        System.out.println("运行时间:" + total);
    }
}
