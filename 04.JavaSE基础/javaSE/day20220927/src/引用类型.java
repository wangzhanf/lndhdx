public class 引用类型 {
    public static void main(String[] args) {
        //2 引用类型
        String name = "wangzhanf";
        System.out.println(name);

        //new 运算符产生新类型对象
        FirstTest firstTest = new FirstTest();
        Object o = new Object();
        firstTest.test01();//调用对象的方法
        o.toString();//调用对象的方法

        //
        int color = 0XFF3366;//基本类型
//        color.toString();
        Integer color1 = new Integer(color);//包装类型
        color1.toString();

        Integer color2 = 123;//自动封装，  将 123 int自动包装为   Integer类型


    }
}
