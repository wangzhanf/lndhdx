public class 方法重载 {
    public static int getIntMax(int x,int y){return x>y?x:y;}
    public static double getDoubleMax(double x,double y){return x>y?x:y;}
    public static Object getMax(Object x,Object y){
        if(x.equals(y))
            return x;
        else
            return y;
    }
    public static int getMin(int x,int y){return x<y?x:y;}
    public static double getMin(double x,double y){
        return (int)(x<y?x:y);
    }
    public static void main(String[] args) {
        System.out.println(getIntMax(3,5));//通过函数能够求得两个数的最大值
//        System.out.println(getIntMax(3.3,5.5));//报错
        //解决方法1 ，通过不同函数实现 , 缺陷：用户需要记忆不同的函数名称
        System.out.println(getDoubleMax(3.3,5.5));
        //解决方法2 ，利用多态概念，使用抽象的父类涵盖所有可能的子类。缺陷：子类型不同处理措施是不同
        System.out.println(getMax(3,5));
        System.out.println(getMax(3.3,5.5));
        //解决办法3,利用重载,编译器会在编译时确定具体调用那个重载的函数
        //重载属于前绑定【静态多态】
        System.out.println(getMin(3,5));
        System.out.println(getMin(5.5,3.3));
    }
}
