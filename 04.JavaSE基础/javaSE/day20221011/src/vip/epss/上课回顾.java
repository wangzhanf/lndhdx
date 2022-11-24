package vip.epss;

public class 上课回顾 {
    public static void main(String[] args) {
        Student student = new Student();
        student.birthdayParty();
        Person person = new Person();
        person.birthdayParty();
//        ((Student)person).birthdayParty();
        Person p1 = new Student();//多态向上造型，
        p1.birthdayParty();
//        abc(person,student);
        abc(person,student);
    }

    public static void abc(Student p, Student s){

    }
    public static void abc(Person p, Person s){

    }
}
//public  >   protected   >  默认friendly    >  private
class Person extends Object{
    private String name;
    private int age;
    public void birthdayParty(){
        System.out.println("Person过生日");
        this.age += 1;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person{
    private double score;
    public void birthdayParty(){
        System.out.println("Student过生日");
        this.setAge(this.getAge() + 2);
    }
}