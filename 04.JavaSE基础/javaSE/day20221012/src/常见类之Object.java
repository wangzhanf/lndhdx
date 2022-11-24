public class 常见类之Object {
    public static void main(String[] args) {
        Person person1 = new Person(1,"zs");
        Person person2 = new Person(3,"ls");
        Person person3 = new Person(3,"zsdxf");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        System.out.println(person1);
        System.out.println(person2.toString());
        System.out.println(person3);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person2.equals(person3));
    }
}

class Person{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "我的类型Person@#￥" + this.hashCode();
    }

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        int ret = 1;
        for (int i = 0; i < 3; i++) {
            ret *= this.id;
        }
        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if(this.hashCode() == ((Person)obj).hashCode()){
            flag = true;
        }
        return flag;
    }
}
