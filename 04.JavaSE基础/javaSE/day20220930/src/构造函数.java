public class 构造函数 {
    public static void main(String[] args) {
        //当前Employee定义时，所有的属性都是private，
//        Employee ls = new Employee();//调空参构造初始化对象
        Object ls = new Employee();//使用父类声明变量接收子类具体对象，多态的一种表现
//        (Employee)ls;
        ((Employee)ls).showMe();
        Employee zs = new Employee("张三", 18, 1234.56);
        zs.showMe();
    }
}
/**
 * 员工类： 将员工信息包装【封装】起来，便于程序操作
 */
class Employee {
    private String ename;
    private int age;
    private double salary;
    private byte department;//部门
    //创建自己的带参的构造函数
    /*public Employee(String m_ename,int m_age,double m_salary){
        System.out.println("带参构造函数");
        ename = m_ename;//将构造传递的参数赋值给对象的属性
        age = m_age;
        salary = m_salary;
    }*/

    public Employee(String ename, int age, double salary) {
        System.out.println("带3参构造函数");
        this.ename = ename;//将构造传递的参数赋值给对象的属性
        this.age = age;
        this.salary = salary;
    }
    //再idea中  通过  alt + insert   调出  代码生成器


    public Employee(String ename, int age, double salary, byte department) {
        /*this.ename = ename;
        this.age = age;
        this.salary = salary;*/
        this(ename, age, salary);//调用已有的具有3个参数的构造函数,
        this.department = department;
    }

    public Employee() {
        System.out.println("空参构造函数");
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getDepartment() {
        return department;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    //展现自我
    public void showMe() {
        System.out.println("员工姓名：" + ename + ",年龄：" + age + ",工资：" + salary);
    }
}