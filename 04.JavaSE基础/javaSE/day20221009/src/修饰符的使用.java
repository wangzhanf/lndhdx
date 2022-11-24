//1 客户端编程人员，组织业务流程
public class 修饰符的使用 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //employee.ename = "admin";//违反了原则，不能访问private的成员
        employee.setEname("zhangsan");//调用了setter
        System.out.println(employee.getEname());//调用了getter
        System.out.println(employee.toString());
    }
}

//2 类库设计人员
class Employee{//员工类
    //要求：用户的名字不能使用  admin
    private String ename;//建议所有属性都采用private修饰
    private double money;//私有，只有自己能动自己的钱

    public String getEname(){
        return this.ename;
    }
    public void setEname(String ename){
        /*this.ename = ename;*/
        //ename不能为 空  ，也不能为admin， 如果为空则使用  guest  ，如果为admin则报错
        if(ename == ""){
            this.ename = "guest";
            return;
        }
        if(ename == "admin"){
            System.out.println("用户名不能是admin");
            return;
        }
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                '}';
    }
}