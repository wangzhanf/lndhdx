public class 参数传递方式 {

    public static void getX(int x){
        x = 3*x;
    }
    public static  void getY(int[] y){
        y[0] = 3*y[0];
        System.out.println("hehe");
    }



    public static void main(String[] args) {
        Dog dog1 = new Dog();
        int x = 8;
        System.out.println(dog1);//Dog@49e4cb85
        System.out.println(x);//8
        System.out.println(dog1.age);//5
        func1(x,dog1);//dog1实参
        System.out.println(x);//8
        System.out.println(dog1.age);//6
    }
    public static void func1(int x,Dog dog){//dog形参
        dog.age = 6;
        x = 99;
        System.out.println(dog);////Dog@49e4cb85
    }
}
class Dog{
    public int age = 5;
    public double len = 0.25;
}