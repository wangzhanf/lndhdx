public class 乘法表 {
    public static void main(String[] args) {
        for (int i = 1; i < 10;i++) {
            /*for (int j = 1; j <= i; j++) {
                if(i*j > 9){
                    System.out.print(i + " * " + j + "=" + i*j + "\t");
                }else{
                    System.out.print(i + " * " + j + "=" + i*j + "\t\t");
                }
            }*/
            {//创建了一个代码块，java的变量作用域【成员，函数，语句块】
                int j = 1;
                //for (;;) {
                while (true) {
                    //循环的条件
                    if(j > i){
                        break;  //输出倒3角
                    }
                    //循环体
                    if(i*j > 9){
                        System.out.print(i + " * " + j + "=" + i*j + "\t");
                    }else{
                        System.out.print(i + " * " + j + "=" + i*j + "\t\t");
                    }
                    //自增自减改变状态
                    j = j + 1;
                }
            }
//            System.out.println(j);//j已经超出了作用域
            System.out.println();
        }


        for (int i = 0,sum = 0; i <= 100;sum+=++i) {
            System.out.println(sum);
        }

    }
}
