package dataStruct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 学生信息查询系统 {
    public static void main(String[] args) {
        Stu u1 = new Stu("u1",18,true);
        Stu u2 = new Stu("u2",19,false);
        Stu u3 = new Stu("u3",20,false);
        Stu u4 = new Stu("u4",21,true);
        Stu u5 = new Stu("u5",22,true);

        System.out.println("===========学生信息管理系统============");
        //1 创建登记册
        List<Stu> stuList = new ArrayList<>();
        //2 注册学员
        stuList.add(u1);
        stuList.add(u2);
        stuList.add(u3);
        stuList.add(u4);
        //3 查询人数
        System.out.println("当前共有学生人数：" + stuList.size());
        //4 展示所有学生
        System.out.println("姓名\t\t\t年龄\t\t\t性别");
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i));//hashcode
        }
        //5 查找是否包含指定学生
        System.out.println("是否存在u2:"+stuList.contains(u2));
        System.out.println("是否存在u5:"+stuList.contains(u5));
//        new LinkedList<>();
        System.out.println("------------------------------");
        //6 查找所有的男生
        List<Stu> roomStus = new LinkedList<>();
        for (int i = 0; i < stuList.size(); i++) {
            if(stuList.get(i).isGender()){
//                System.out.println(stuList.get(i));
                roomStus.add(0,stuList.get(i));
            }
        }

//        iterator  迭代器

        System.out.println("--------我是有底线的------------");
    }
}

class Stu{
    private String name;
    private int age;
    private boolean gender;

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Stu(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name + "\t\t\t" + this.age + "\t\t\t" + (this.gender?"男":"女");
    }
}