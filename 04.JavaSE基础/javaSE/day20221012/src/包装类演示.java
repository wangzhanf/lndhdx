public class 包装类演示 {
    public static void main(String[] args) {

        /*int a = 3,b = 4;
        int c = a + b;//
        System.out.println(a == b);

        Integer ao = new Integer(3);
        Integer bo = new Integer(4);
        Integer co = null;*/

        //1 数字1234 转换为   ”1234“
       //String ret = "" + 1234;
        //2 转换  ”1234“ 为   1234
//        int abc = (int)"1234";
       ///Integer abc = Integer.parseInt("1234");
        ///String s = new String("1234");

       /* Integer abc;
        abc = 123;
        abc = abc + 456;
        abc.shortValue();
*/


        //
        //Java中的包装类，类似于JavaScript中的Number

//        System.out.println(ao.equals(bo));
//        co = ao.add(bo);

        int a = 156;
        System.out.println("int:" + a);
//        System.out.printn("byte" + (byte)a);
        Integer ao = 156;
        System.out.println(ao.byteValue());
        //推导   156  --》   -100
        //实现自己的包装类实现int到byte的转换



    }
}
class myByte{
    private byte val;
    public void transfer(){

    }
}
