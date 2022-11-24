public class 对象内存分布 {
    public static void main(String[] args) {
        //可以使用 sizeof获取数据类型的长度
        //Dog amy = new Dog(); // 4 + 1 + 8字节大小，需要考虑字节对齐问题
        //amy.showMe();//对象调用其成员方法
        //仅仅为了测试showMe是否可用，默认初始化值是否设置
        //1 匿名对象的第一种应用
        new Dog().showMe();//new和   .   都是运算符   ,new的优先级高于  .
        //匿名对象失去引用，在java中，没有被引用的对象，则占用空间被标识为垃圾，java的GC清理时会清理该对象
        //2 匿名对象的第二种应用，作为函数参数传递
        /*Dog d1 = new Dog();
        Dog d2 = new Dog();
        sample(d1,d2);*/
        sample(new Dog(),new Dog());
        /*Dog[] dogs = new Dog[5];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }*/

    }

    public static void sample(Dog d1,Dog d2){
        System.out.println(d1.equals(d2));
    }
}
class Dog{
    private int age = 1;//设定默认的初始值
    private byte type = 1;
    private double height = 3.6;

    public void showMe(){
        System.out.println("age:" + age + ",type:"+type+",height:"+height);
    }
}