public class 字符串比较 {
    public static void main(String[] args) {
        MyString myString = new MyString();
        myString.hashCode();
        boolean f ;
        try{
            f = myString.byb(null,null);
        }catch (NullPointerException exception){
            exception.printStackTrace();
            throw exception;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello");
//        System.out.println(f);
    }
}

class MyString{
    public boolean byb(String a,String b) throws NullPointerException{
       /* System.out.println(a.codePointAt(0));
        if(a.codePointAt(0) == b.codePointAt(0) || a.codePointAt(0) == b.codePointAt(0) -32 )
*/
        boolean flag = false;
        if(a.equals(b)){
            flag = true;
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}