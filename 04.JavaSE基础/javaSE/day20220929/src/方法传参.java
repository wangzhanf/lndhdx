public class 方法传参 {
    int a = 33;
    int b = 55;
    //定义一个方法
    public static int getMax(int x,int y){
        int temp;
        temp = x > y ? x : y;
        return temp;
    }
    public int getMin(){
        int flag;
        flag = this.a > this.b ? this.b : this.a;
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(getMax(3,5));//5
        //geMin();//错误的
        方法传参 obj = new 方法传参();
        System.out.println(obj.getMin());//33
    }
}
