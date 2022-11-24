public class 覆写的基本语法 {
    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        hunter.work(1);
        SubHunter subHunter1 = new SubHunter("zds",4);
        subHunter1.work(2);
        SubHunter subHunter2 = new SubHunter("zxs",2);
        subHunter2.work(2);
//        subHunter.newWork();
        //调用两个同类对象的比较
        subHunter1.bijiao(subHunter2);//客户端程序员就需要知道比较使用的函数是哪个。
        //利用所有类都继承自Object，使用Object提供的比较方法同一覆盖实现
        subHunter2.equals(subHunter1);//所有的java程序员都知道Object提供了equals方法用于对象比较
        System.out.println(subHunter1);//默认展示的 类似于内存地址的  hashCode值
        System.out.println(subHunter2.toString()); //Java中，直接输出对象隐式调用toString()方法
    }
}

class Hunter{
    protected int  work(int a){
        System.out.println("使用弓箭打猎");
        return 1;
    }
}
class SubHunter extends Hunter{
    private int foxNumber = 0;
    private String hname;
    public SubHunter(String hname,int foxNumber){
        this.hname = hname;
        this.foxNumber = foxNumber;
    }

    //改进父辈的工作方式,缺陷就是方法名太多
    /*public void newWork(){
        System.out.println("新工作方式");
    }*/
    @Override
    public int work(int abcd){
        System.out.println("使用新式武器打猎");
        return (byte)1;
    }

    public void bijiao(SubHunter oth){
        boolean flag = this.foxNumber > oth.foxNumber ? true : false;
        System.out.println(flag);
    }

    @Override
    public boolean equals(Object oth) {
//        return super.equals(obj);   return this == oth;
        boolean flag = this.foxNumber > ((SubHunter)oth).foxNumber ? true : false;
        return flag;
    }

    @Override
    public String toString() {
        return "猎人后代:" + this.hname + ",猎取狐狸数量：" + this.foxNumber;
    }
}
/* public   >  protected   >  默认friendly   >  private */