package dataStruct;

import java.util.*;

public class 集合基础 {
    public static void main(String[] args) {
        //需求：存储3个学生的成绩
//        int stu1 = 60;
        /*int[] scores = {60,75,88};
        System.out.println(scores.length);
        //
        scores[3] = 99;
        System.out.println(scores.length);*/

        List ints = new ArrayList<Integer>();
        List doubls = new LinkedList<Double>();
        ints.add(3);
        ints.add(4);
        ints.add(3);
        System.out.println(ints.size());

        HashSet<Float> floats = new HashSet<>();
        floats.add(3.2F);
        floats.add(3.2F);
        System.out.println(floats.size());

        HashMap<String, Integer> ages = new HashMap();
        ages.put("zs",18);
        ages.put("ls",19);
        System.out.println(ages.get("zs"));

        //数组
        Number[] floats1 = new Number[3];
        floats1[0] = 97;

        List<Integer> alist = new ArrayList();
        alist.add(1);
//        alist.add(3.14F);
    }
}
