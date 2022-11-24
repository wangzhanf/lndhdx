public class 关于继承 {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        System.out.println(person.age);//Person继承了Animal，拥有Animal的所有属性和方法
        System.out.println(dog.age);//报错，Dog和Animal不存在关系，没有age属性
        person.eat();
        dog.eat();
    }
}

class Animal{//动物   等同于   class Animal extends Object
    int age;//寿命
    public void eat(){
        System.out.println("吃");
    }
}

class Person extends Animal{//人类
    int iq;//智商
}
class PersonFriend{//人类的好朋友

}
class Dog extends Animal{//狗

}
