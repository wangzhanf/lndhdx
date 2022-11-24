public class 继承的实例化过程 {
    public static void main(String[] args) {
        //实例化一只猫，经历的过程
//        猫类 cat1 = new 猫类();
//        猫类 cat2 = new 猫类(5.6F,"折耳猫");
        猫类 cat3 = new 猫类(true,false,7.8F,"加菲猫");
        System.out.println(cat3.toString());
    }
}
class 生物 extends Object{
    {System.out.println("生物类的代码块1");}
    static {System.out.println("生物类的static代码块1");}
    public 生物() {
        //隐式的调用了  Object() 构造函数
        System.out.println("生物类的空参构造");
    }
    public 生物(Boolean death){
        this.死亡状态 = death;
    }
    Boolean 死亡状态 = false;//如果不考虑效率，建议使用包装类
}
class 植物 extends 生物{
    Double 光合效率 = 0.0;
}
class 动物 extends 生物{
    {System.out.println("动物类的代码块1");}
    static {System.out.println("动物类的static代码块1");}
    Boolean 饥饿状态 = false;
    public 动物() {
        //隐式的调用了  生物() 构造函数
        System.out.println("动物类的空参构造");
    }
    public 动物(Boolean death,Boolean hungry){
        super(death);
        this.饥饿状态 = hungry;
        /*this.死亡状态 = death;*/
    }
    public void eat(){
        System.out.println("吃");
    }
}
class 人类 extends 动物{
    Integer 智商 = 90;

}
class 猫类 extends 动物{
    {System.out.println("猫类的代码块1");}
    static {System.out.println("猫类的static代码块1");}
    String 品种;
    Float 毛发长度;
    public 猫类() {
        //隐式调用了  动物() 构造函数
        super();//显性调用父类的构造函数
        System.out.println("猫类的空参构造");
    }
    //带参构造
    public 猫类(Float 毛发长度){
        this();//显性调用了当前类重载的构造方法
        this.毛发长度 = 毛发长度;
        System.out.println("猫类的1参构造");
    }
    public 猫类(Float 毛发长度,String 品种){
        this(毛发长度);//显性调用了当前类重载的构造方法
        this.品种 = 品种;
        System.out.println("猫类的2参构造");
    }
    //构造一个携带父类基本信息
    public 猫类(Boolean death,boolean hungry,Float 毛发长度,String 品种){
        /*this(毛发长度,品种);
        super();*/
        super(death,hungry);
        this.毛发长度 = 毛发长度;
        this.品种 = 品种;
        System.out.println("猫类的4参构造");
    }

    @Override
    public String toString() {
        return "猫类{" +
                "品种='" + 品种 + '\'' +
                ", 毛发长度=" + 毛发长度 +
                ", 饥饿状态=" + 饥饿状态 +
                ", 死亡状态=" + 死亡状态 +
                '}';
    }
}