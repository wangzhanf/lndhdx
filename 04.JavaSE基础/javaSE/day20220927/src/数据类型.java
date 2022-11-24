public class 数据类型 {
    public static void main(String[] args){
        //1 基本类型
        char firstName = '张';//char类型表示一个字符，character，占2字节， 字符类型使用  单引号
        boolean gender = false;//boolean代表布尔类型，true和false，占1字节。
//        byte b1 = 128;//byte占 1个字节 ，11111111（-128）   ~   0 1111111（127）   ，
        //java是强类型语言，数值类型是有符号【最左侧为1代表负，0代表正】
        //如果数值字面量没有修饰，默认类型    int   ， double
        byte b1 = (byte)144;//byte占 1个字节 ，1 1111111（-128）   ~   0 1111111（127）   ，
        System.out.println(b1);
//        short s1 = 32767;
        short s1 = (short)32768;//short  占2个字节
        System.out.println(s1);

        int i1 = (1<<31) -1;//int占4个字节，默认的整数类型
        int i2 = 0XFF;//十六进制表示  255
        System.out.println(i1);
        System.out.println(i2);

        long l1 = (1<<63);//long 占8个字节
        System.out.println(l1);

        //如果数值字面量没有修饰，默认类型    int   ， double
        float f1 = 3.14F;//float占4个字节，
        System.out.println(f1);

        double d1 = 3.14;//double占8个字节
        System.out.println(d1);


        System.out.println("===================分割线=====================");
//        String  是一种引用类型，JavaScript种字符串是基本类型，双引号包裹
        long    phone = 13898647536L;//int不能表示


    }
}
