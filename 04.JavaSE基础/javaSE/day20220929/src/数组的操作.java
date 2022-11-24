import java.util.Arrays;

public class 数组的操作 {
    public static void main(String[] args) {
        int[] ages = {29,28,26,27};//声明ages数组，定义空间为4个整数长度
//        int[] dst;//声明一个空数组
//        System.out.println(dst);//报错
        int[] dst = new int[4];//声明一个空数组

        System.out.println(ages);//[I@7c30a502  hashcode码   理论上唯一，可以认为是内存地址的一种形式
        System.out.println(dst);//[I@49e4cb85

        //数组名称直接赋值给另外一个数组，本质上仅仅把数组地址赋值给另一个数组变量
        //意味着 有两个变量指向同一个数组地址空间，数组也是对象，数组名是数组空间的地址
//        dst = ages;//完成赋值
//        System.out.println(dst);//[I@7c30a502
//        System.out.println(dst[0]);//29
//        ages[0] = 33;
//        System.out.println(dst[0]);//33

        //数组的操作，可以使用第三方的包相关方法完成。
        System.arraycopy(ages,1,dst,0,2);
        System.out.println(dst[0]);
        System.out.println(dst[1]);
        System.out.println(dst[2]);


        //
        int[] srcArr = {10,2,3,4};
        int[] dstArr = new int[4];//没有分配空间，
//        dstArr = srcArr;//浅拷贝， 只拷贝了数组的地址


/*        for (int i = 0; i < srcArr.length; i++) {
            dstArr[i] = srcArr[i];
        }*/
        //如果数组中存放的是对象【作业： 查阅  浅拷贝和深拷贝】
        System.arraycopy(srcArr,0,dstArr,0,srcArr.length);

        //对数组排序
        System.out.println(Arrays.binarySearch(dstArr,3));//2
        Arrays.sort(dstArr);
        //Arrays提供了对数组操作的很多方法


        for (int i = 0; i < dstArr.length; i++) {
            System.out.println(dstArr[i]);
        }


    }
}
