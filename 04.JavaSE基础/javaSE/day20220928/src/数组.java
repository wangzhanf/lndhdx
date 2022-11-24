public class 数组 {
    public static void main(String[] args) {
        //1 声明    数组类型   变量名 [ =  初始化列表]
        //数组类型就是数组存储数据的类型
//        int scores[];//
//        int[] cnames;//推荐 ，整数类型的数组，数组名 cnames

        //2 数组的初始化
        //静态初始化
//        int[] scores = {2,4,6,5,3,1};//声明了一个6位长度的数组，分别用列表内数据进行初始化
        //动态初始化
//        int[] scores = new int[6];//6 代表数组的长度, int是基本类型
        Integer[] scores = new Integer[6];// 比较合理的表示

        int len = 3;
        String[] names = new String[len];//数组的长度可以使用变量

        //3 数组元素的访问，通过下标访问[设置和读取]
        //3.1   数组未被明显初始化的部分都会使用默认值初始化
        scores[1] = 88;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
//        System.out.println(scores[-1]);
//        System.out.println(scores[6]);

        System.out.println(names[1]);



        Integer[] luckNums = new Integer[3];
        luckNums[0] = 33;//此时发生了自动包装，  33 这个int自动转为Integer
//        luckNums[1] = 34.0;

//        System.out.println(luckNums[0].floatValue());
//        System.out.println(luckNums[1].floatValue());//NullPointerException

        Object[]/*空间*/ types = new Object[5];
        types[0] = 12;/*羊*/
        types[1] = 3.1415926;/*人*/
        types[2] = "zhangsan";
        types[3] = false;

    }
}
