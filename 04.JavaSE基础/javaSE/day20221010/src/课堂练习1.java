public class 课堂练习1 {
    public static void main(String[] args) {
        Homers homers = new Homers();
        homers.setAge(40);
        Dog dog = new Dog();
        dog.setAge(3);//35
        homers.eat();
        dog.eat();

//        homers.bijiao(dog);
        System.out.println(homers);
        System.out.println(dog);
        System.out.println(homers.equals(dog));
    }
}

class Animal extends Object{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("所有动物都需要进食");
    }
    public boolean bijiao(Animal animal){
        return true;
    }
    //比较原则：  年龄相同就认为是一样的
    @Override
    public boolean equals(Object oth){
//        return this == oth;
        boolean flag = false;
        if(this instanceof Homers){//如果当前调用者对象是人
            if(oth instanceof Dog){
//                flag = (this.age > (((Animal)oth).age * 5 + 20) )? true : false;
                flag = (this.getAge() > ((Dog) oth).getAge() * 5 + 20) ? true : false;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "年龄：" + this.getAge();
    }
}

class Homers extends Animal{
    @Override
    public void eat(){
        System.out.println("人类吃饭");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗啃骨头");
    }
}