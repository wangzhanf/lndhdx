public class 权限限定符号 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        //sub.subvar1 = 1;//报错， private只有在当前类的内部方法才可以方法
        sub.var2 = 22;
        sub.subvar2 = 2;

        sub.var3 = 33;
        sub.subvar3 = 3;

        OtherC otherC = new OtherC();

    }
}

class Base extends  Object{//基类
    private int var1;
    int var2;
    protected int var3;
    public int var4;
}

class Sub extends Base{//子类
    private int subvar1;
    int subvar2;
    protected int subvar3 = var3+2;
    public int subvar4;
    public void setSubvar1(int val){
        this.subvar1 = val;
    }
}
class OtherC{

}