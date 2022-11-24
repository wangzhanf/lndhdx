public class 动物世界 {
    public static void main(String[] args) {
//        Person person = new Person();
        Animal stu = new Student();
        Dog dog = new Dog();
        stu.eat();
        dog.eat();


//        Animal animal = new Animal();
//        animal.eat(); //
    }
}
abstract class  Animal{

    //存在的意义是抽象，代码复用, Animal有必要产生具体的实例对象吗，无必要
    //1 私有化构造函数     2  大部分的方法无需具体实现
    //java的解决方案：
    /*private Animal(){}*/
    protected int age;
    protected boolean hungry;
    /*protected void eat(){
        System.out.println("动物进食");
    }*/
    protected abstract void eat();
    protected void birthdayParty(){
        this.age += 1;
    }
}
abstract class Person extends Animal{
    protected  String name;
}
class Student extends Person{
    private double score;
    @Override
    public void eat(){
        System.out.println("学生吃学校食堂");
    }
}
class Dog extends Animal{
    protected void eat(){
        System.out.println("狗啃骨头");
    }
}


