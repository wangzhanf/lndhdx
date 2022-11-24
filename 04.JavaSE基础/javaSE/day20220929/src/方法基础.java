public class 方法基础 {
    //权限修饰符 static修饰符 返回值类型  方法名(形参列表){
    //      方法体
    // }
    public static void printStar(){
        System.out.println("*****");
    }
    static int sum3 = 0;

    public static int printStar1(int num){
        int i;
        for (i = 1; i <= num; i++) {
            System.out.print("*");
        }
        sum3 += --i;
        return i;

    }

    public static void main(String[] args) {
//        printStar();
        int sum = 0;
        int sum1 = 0;
        int num1 = 18;
        int num2 = 6;
        sum1 += printStar1(num1);
        sum+=num1;
        sum1 += printStar1(num2);
        sum+=num2;
        //在此处输出已打印 “ * ” 的个数
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum3);
    }
}
