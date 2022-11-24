public class 课堂练习 {
    public static void main(String[] args) {
        OutWrap outWrap = new OutWrap();
        outWrap.fun1().fun2().fun1();
        System.out.println(outWrap.getName());
    }
}
//类拥有name属性，有两个方法，分别在name外包裹  【】  和  {}
class OutWrap{
    private String name;
    public OutWrap(){
        this.name = "anonymous";
    }
    public OutWrap fun1(){
       this.name += "【" + this.name + "】";
       return this;
    }
    public OutWrap fun2(){
        this.name += "{" + this.name + "}";
        return this;
    }
    public String getName(){
        return this.name;
    }
}