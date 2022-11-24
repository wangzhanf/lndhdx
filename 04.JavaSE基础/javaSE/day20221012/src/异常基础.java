import java.io.EOFException;
import java.io.IOException;
import java.util.Date;

public class 异常基础 {
    //Integer abc = new Integer(9);
//    IOException
//    EOFException
//客户端编程
    public static void main(String[] args){
        /*int a = 0;
        if(a >= 8 && ++a==8){
            System.out.println("abc");
        }

        *//*float x = 1.9F;
        for(;x != 1.0;x -= 0.1){
            System.out.println(x);
        }*//*
        int[] arr = new int[2];
        *//*try{
            double bc = 9/a;//可能产生问题的代码部分
            arr[3] = 9;
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Exception");
            return;
        }*//*



        System.out.println("abcdee");*/

        //传入一个数组，数组的最后一个元素是 分割的份数  [2,6,9,4,3]  (2+6+9+4)/3
        //返回   7
//        1 通用代码设计  ，通过函数解决

        int[] iArr = {2,6,9,5,3};
        Spliter spliter = new Spliter();

        try{
            Date date = new Date();
            Integer bbb = 99;
            int bcd = 9;
            System.out.println(spliter.splitResult(iArr));
        }catch (RuntimeException e){
            System.out.println("产生了异常");
            throw e;
        }finally {
            System.out.println("必定会被执行的代码");
        }
//        return bcd;
    }


}
class Spliter{
    public int splitResult(int[] arr) throws RuntimeException{
        int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += arr[i];
            }

        int avg = sum/arr[4];
        return avg;
    }
}
