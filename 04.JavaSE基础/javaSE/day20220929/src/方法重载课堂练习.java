import java.util.Arrays;

public class 方法重载课堂练习 {
    public static int getMax(int[] arr){
        int temp = arr[0];//标准线，基线
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > temp)
                temp = arr[i];
        }
        return temp;
    }
    public static double getMax(double arr[]){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[0])
                arr[0] = arr[i];
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arrInt = {4,8,2,7,6};
        double[] arrDouble = {0.75,0.618,0.72,3.14};
        System.out.println(getMax(arrInt));
        System.out.println(getMax(arrDouble));
        System.out.println(arrInt[0]);
        System.out.println(arrDouble[0]);
        //利用重载可以完成任务，真正项目中可以利用Arrays工具类（提供了很多static方法，无需创建对象即可使用的类）
        Arrays.sort(arrInt);//完成排序  ,java工具类提供的排序算法会更高效和稳定
        System.out.println(arrInt[arrInt.length-1]);
    }
}
