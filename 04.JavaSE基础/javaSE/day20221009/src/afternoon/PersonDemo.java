/*包管理：名字空间【默认的包，package指定包名称，便于发布】
* 包引用：1 完整的包路径  2  import  引入
* */
package afternoon; //package 的结构和目录结构相关，一般包名符合标准标识符规范
import java.util.Date;
//客户端程序
public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setPname("zs");
//        p1.work();
//        p1.work();
//        p1.work();
        p1.work().work().work().work();
        Person p2 = new Person();
        p2.setPname("ls");
        p2.buy();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
//类库设计
//声明Person类
class Person extends Object{//所有类默认都继承自Object
    private static int pidBase = 1000;//static也称之为类变量，pid基准
    private int pid;
    private String pname;
    private int page;
    private double pmoney = 123.45;

    {
        this.pid = pidBase++;
    }
    public Person(){

    }
    public void setPname(String pname){
//        if(pname == "admin"){//不建议的写法
//        if(pname.equals("admin")){   //建议：用字符串字面量调用equals方法进行判断
        if("admin".equals(pname)){   //建议：用字符串字面量调用equals方法进行判断
            this.pname = "guest";
        }else{
            this.pname = pname;
        }
    }
    public String getPname(){
        return this.pname;
    }
    //快速产生setter和getter的方式，  alt+insert代码生成器
    public int getPage() {
        return this.page;
    }
    public void setPage(int page) {
        if(page > 100 || page < 0){
            this.page = 8;
        }else{
            this.page = page;
        }
    }

    public Person work(){
        this.pmoney += 10;
        return this;
    }
    public void buy(){
        this.pmoney -= 20;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                ", pmoney=" + pmoney +
                '}';
    }
}
