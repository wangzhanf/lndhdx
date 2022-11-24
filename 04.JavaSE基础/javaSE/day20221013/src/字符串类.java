public class 字符串类 {
    public static void main(String[] args) {
//        //字符串对象的生成
//        //1 字面量方式   ,  字符串是只读的 ,同样内容的字符串，只开辟一个对象空间
//        String a = "ab";
//        //2 new方式
//        String b = new String("bc");
//        String d = "abbc";
//        a = a + b;
//        int c = 144;
//        Integer k = new Integer(144);
//        Integer e = 144;//完成了自动包装，  -128到127 共享对象空间
//        Integer f = 144; //   e == f   真  假
//
//        String s = "123.45";
//        Float fs = Float.valueOf(s);

        String s = "123.45";
        Float aFloat = new Float(s);
        Float aFloat1 = Float.valueOf(s);
        float v = Float.parseFloat(s);

    }
}
