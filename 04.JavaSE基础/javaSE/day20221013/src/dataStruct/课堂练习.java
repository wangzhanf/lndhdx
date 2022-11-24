package dataStruct;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class 课堂练习 {
    public static void main(String[] args) {
        //选择容器： Set
        Set<Student> studs = new HashSet();
        Student stu1 = new Student("张三");
        Student stu2 = new Student("李四");
        studs.add(stu1);
        studs.add(stu2);
        studs.add(stu1);
        studs.add(new Student("王五"));
        System.out.println(studs);
        System.out.println(studs.size());

    }
}

class Student{
    private String name;
    public Student(String name){
        this.name = name;
    }
}

