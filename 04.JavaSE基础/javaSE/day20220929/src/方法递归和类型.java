import java.math.BigInteger;
import java.util.Scanner;

public class 方法递归和类型 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number:");
        num = scanner.nextInt();
        int ret = 0;
        ret = func(num);
        System.out.println("result:"+ret);

    }

    public static BigInteger func(BigInteger num){
        if(num. == 1){
            return new BigInteger("1",10);
        }
        return func(num-1) * num;
    }
}
