public class 相声演员 {
    public static void main(String[] args) {
        某著名相声演员 yq = new 某著名相声演员();
        yq.抽烟().喝酒().烫头().抽烟().喝酒();
/*        Sub sub = new Sub();
        sub.var2 = 88;*/
    }
}

class 某著名相声演员{
    public 某著名相声演员 抽烟(){
        System.out.println("抽烟");
        return this;
    }
    public 某著名相声演员 喝酒(){
        System.out.println("喝酒");
        return this;
    }
    public 某著名相声演员 烫头(){
        System.out.println("烫头");
        return this;
    }
}