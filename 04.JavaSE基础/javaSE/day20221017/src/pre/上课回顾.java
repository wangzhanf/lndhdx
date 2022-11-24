package pre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 上课回顾 {
    public static void main(String[] args) throws IOException {
        //2 数据结构
        List<Student> students = new ArrayList<>();
        students.add(new Student("zs",18));
        students.add(new Student("ls",19));
        students.add(new Student("ww",20));

        //3 数据持久化--文件
        File file = new File("c:/xx/abc.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student stu:students) {
            fileWriter.write(stu.toString());
        }
        fileWriter.flush();
        fileWriter.close();


        //读出
    }
}
//1 类组织数据
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + "\n";
    }
}