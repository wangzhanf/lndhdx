public class 类的定义 {
    public static void main(String[] args) {
        /*Student zs = new Student();//产生了一个Student类的实例对象zs
        zs.name = "zhangsan";
        zs.age = 99;
        zs.showMe();*/
        Student student = new Student();//可以使用alt+enter 快速创建局部变量


    }
}

/*用public修饰的类，其所在文件的文件名必须和类名相同*/
class Student {//类的定义
    private String name;//学生姓名属性
    private long sno;//学号
    private Integer age;//年龄,用包装类表示，方便的调用包装类的属性和方法
    private double score;//成绩
    private boolean gender;

    //如果你希望其他程序能够调用该方法，建议使用public
    public void showMe() {
        System.out.println("我的姓名是：" + name + "年龄是：" + age);
    }

}
