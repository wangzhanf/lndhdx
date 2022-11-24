public class String的相关类 {
    public static void main(String[] args) {
        Haha haha = new Haha();
        System.out.println(haha);
        String s = "abc";
        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuilder stringBuilder = new StringBuilder("abc");

        System.out.println(s.hashCode());
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuilder.hashCode());

        stringBuffer.append(1);
        stringBuilder.append(2);
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println(s);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println(s.equals(stringBuffer));
        System.out.println(s.equals(stringBuilder));
        System.out.println(stringBuffer.equals(stringBuilder));
    }
}

class Haha{}