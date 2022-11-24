package demo.epss;

import java.io.Serializable;

public class 接口的应用 {
    public static void main(String[] args) {
        //编程太具体化，
/*        长方形 s1 = new 长方形(3,4);
        正方形 s2 = new 正方形(3);
        正圆 c1 = new 正圆(5);
        正圆 c2 = new 正圆(2);

        正圆[] cArr = new 正圆[4];
        cArr[0]  = c1;
        cArr[1] = c2;
        cArr[2] = s1;//报错*/

        形状 s1 = new 长方形(3,4);
        形状 s2 = new 正方形(3);
        形状 c1 = new 正圆(5);
        形状 c2 = new 正圆(2);
        形状[] sArr = new 形状[4];
        sArr[0] = s1;
        sArr[1] = s2;
        sArr[2] = c1;
        sArr[3] = c2;

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(c1.area());
        System.out.println(c2.area());

        // 如果您想比较两个形状的面积，可以使用areaCompare方法
        // 形状或者形状的派生类对象.areaCompare(形状或者形状的派生类对象)

        /*System.out.println(s1.areaCompare(s2));
        System.out.println(s1.areaCompare(c1));
        System.out.println(s1.areaCompare(c2));*/

        //System.out.println(c2.areaCompare(s1));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(c1));
        System.out.println(s1.compareTo(c2));

    }
}

interface 形状 extends Comparable{
    double area();//所有的形状都应该能够获取其面积,具体子类实现具体求面积方法
    default public boolean areaCompare(形状 s){
        return this.area() > s.area() ? true : false;
//        return this.equals(s);
    }
    default public int compareTo(Object o){
        int flag = 0;
        if(this.area() < ((形状)o).area())
            flag = -1;
        else if(this.area() == ((形状)o).area())
            flag = 0;
        else
            flag = 1;
        return flag;
    }
    /*@Override
    public boolean equals(Object obj){
        if(this.area() >= ((形状)obj).area()){
            return true;
        }
        return false;
    }*/
}
class 椭圆 extends Object implements 形状{//必须覆写非default方法
    protected int x;//长轴
    protected int y;//短轴
    @Override
    public   double area(){
        System.out.println("椭圆求面积的方法");
        return 0.0;
    }
    @Override
    public boolean areaCompare(形状 s){
        return (this.x * this.y > s.area());
    }
}
class 正圆 extends 椭圆 {
    protected final double PI = 3.14;//不可被修改的常量定义
    public 正圆(int x){
        this.x = this.y = x;
    }
    @Override
    public double area(){
        return this.x * this.y * PI;
    }
    /*@Override
    protected boolean areaCompare(形状 s){
        boolean flag;
        if(this.area() <= s.area()){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }*/
}
interface 四边形 extends 形状 {
    public static final int a  = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
}
final class 正方形 implements 四边形 {
    private int a;
    public 正方形(int a){
        this.a = a;
    }
    @Override
    public double area(){
        return this.a * this.a;
    }
}
class 长方形 implements 四边形, Serializable,Cloneable {
    private int a;
    private int b;
    public 长方形(int a,int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double area(){
        return this.a * this.b;
    }
}

/*
class 特殊正方形 extends 正方形{
    public 特殊正方形(int a){
        super(a);
    }
}*/
