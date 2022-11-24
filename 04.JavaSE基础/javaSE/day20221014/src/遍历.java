import java.util.*;

public class 遍历 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);integers.add(4);integers.add(3);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

        Iterator i1 = integers.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        Set<Integer> integers1 = new HashSet<>();
        integers1.add(2);integers1.add(4);integers1.add(3);
//        for (int i = 0; i < integers1.size(); i++) {
//            System.out.println(integers1.get(i));
//        }
        //1 转换为数组
        /*Object[] objs = integers1.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println((Integer) objs[i]);
        }*/
        //2 使用迭代器
        Iterator it = integers1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //3 for变体
        System.out.println("=====================");
        for (Integer temp:integers) {
            System.out.println(temp);
        }
        System.out.println("=====================");





        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Map<String, Integer> integers2 = new HashMap<>();
        integers2.put("one",1);
        integers2.put("two",2);
        integers2.put("three",3);
        for (int i = 0; i < integers2.size(); i++) {
            System.out.println(integers2.get(i));
        }

    }
}
