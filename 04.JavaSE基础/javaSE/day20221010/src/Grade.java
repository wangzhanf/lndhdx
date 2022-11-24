//客户端
public class Grade {
    public static void main(String[] args) {
        Tv1 t1 = Tv1.getTv();
    }
}
class Tv1{
    private static Tv1 tv = new Tv1();
    private Tv1(){}
    public static Tv1 getTv(){
        return tv;
    }
}

class Tv2{
    private static Tv2 tv = null;
    private Tv2(){}
    public static Tv2 getTv(){
        if(tv == null)
            tv = new Tv2();
        return tv;
    }
}