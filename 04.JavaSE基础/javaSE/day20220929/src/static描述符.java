public class static描述符 {

    {
        System.out.println("这是代码块");
    }

    static{
        System.out.println("这时静态代码块");
    }

    static int i2 = 3;
    public int func1(int num){
        int i3 = 4;
        i2 = i2+1;
        return i3 * i2;
    }

    public static void func2(int num){
        System.out.println("func2");
    }

    public static void main(String[] args) {
        int i1 = 2;
        static描述符 staticDes = new static描述符();
        int ret = staticDes.func1(i1);
        int ret1 = staticDes.func1(i1+1);
        System.out.println(ret);
        System.out.println(ret1);

        //调用静态方法
        static描述符.func2(2);
    }
}
