/**
 * 面向对象的编程模式【人的思维】--一切皆对象【实例】 ，来自于类【模板】
 * 通过对实例的分析抽象得到类【用户自己创建的数据类型】
 * */
public class 前期知识回顾 {
    //main是整个程序的入口，其他方法都被main直接或间接调用
    public static void main(String[] args) {
        Car car1 = new Car(120,30,3);//new运算符调用Car类的构造函数，在堆heap开辟对象空间，将对象空间的地址【引用】赋值给Car类型的car1变量
        Car car2 = new Car(120,20,3);//调用带参构造
        //两辆车进行比较
        car2.oil();
        System.out.println(car2.myCompare(car1));
        car2.oil();
        System.out.println(car2.myCompare(car1));
        car2.oil();
        System.out.println(car2.myCompare(car1));

        System.out.println("------------------------------");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        System.out.println(car2.myCompare(new Car()));//匿名对象
    }
}
/**
 *  汽车类的声明
 *  作者： wangzhanf
 *  文档注释，目的，可以通过javadoc等工具抽取注释直接生成文档
 * */
/*public */class Car{
    //类会包含成员，主要是属性【状态】，方法【函数】
    int maxSpeed = 240;
    int gear = 0;
    int speed = 0;
    //Java中如果类没有显式的构造函数，则编译器自动创建一个空参构造，如果有显式构造则编译器不会创建空参构造
    public Car(int maxSpeed,int speed,int gear){
        this();//构造函数互相调用出现在首行
        this.maxSpeed = maxSpeed;//this代表当前对象本身
        this.gear = gear;
        this.speed = speed;
    }
    public Car(){
        System.out.println("这是空参构造函数");
    }//形成了重载overload

    //成员方法,
    public boolean myCompare(Car other){
        return  this.speed > other.speed ? true : false;
    }
    //oil，给车加油的方法
    public void oil(){
        this.gear = this.gear + 1;
        this.speed = this.speed + 5;
    }
    //在Java中，Object拥有toString()方法主要目的就是展示自身状态
    //在Java中，Object是所有类的祖宗，编写自己的toString实现自己的状态展示
    // 使用idea快捷键快速生成   代码段  alt+insert

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

