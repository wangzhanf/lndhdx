public class 多态的应用1 {
    public static void main(String[] args) {
        /*Sub1 s1 = new Sub1();*/
        Base1 s1 = new Sub1();
        Base1 s2 = new Sub2();
        s1.fun1();
        s1.eat();
        s1.fun2(s1,s2);//典型多态表现
    }
}

class Base1 extends Object{
    public void eat(){
        System.out.println("Base1  eat() ");
    }
    public void fun1(){
        System.out.println("Base1 fun1()");
    }

    public void fun2(Base1 s1,Base1 s2){

    }
}
class Sub1 extends Base1{
    public void eat(){
        System.out.println("Sub1  eat() ");
    }
}
class Sub2 extends Base1{
    public void eat(){
        System.out.println("Sub2  eat() ");
    }
}