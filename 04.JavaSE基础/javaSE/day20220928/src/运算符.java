public class 运算符 {
    public static void main(String[] args) {
        //1 算术运算符
        int age = 18 + 1;
        //赋值运算符的优先级一般较低
        //自增自减等同于   age++   等同于     age=age+1; 或  age+=1;
        //前置自增自减，先运算自增自减然后再运行其他表达式
        //后置自增自减，先运算其他表达式，再自增或自减
        System.out.println(age);//0 19
        age++; // 返回了  19，执行自增操作  age变为20
        System.out.println(age);//1 20
        System.out.println(age++);//2   先打印20  ，再+1  =  21
        System.out.println(++age);//3   先自增21+1=22，打印22

        //+ 运算符从左到右的结合顺序
        //任何数据和字符串 相加   结果就是字符串【宽】
        //运算符在不同的环境【上下文】形成重载【不同的操作】
        //+如果操作两个数，此时+就是算术加， 如果操作字符串，此时+就是连接字符串
        System.out.println(1 + 2 + "hi" + 3 + 4);//



        //关系运算符
        //1 关系运算符结果总为布尔值
        //2 和JavaScript不同， java中没有 ===  运算符，java中通过  equals()方法解决


        //逻辑运算符
        //1 &&与     ||或    ！取反
        //2 短路运算符 ,  将最容易判定的条件放在关系表达式的最前面
        boolean gender = false;
        // true && false  ==》 false
        // false && { true }  ==>  false   ,{}中的表达式无需运算，这就是短路
        // false || true  ==》 true
        // true || {false}   ==》true    ，{} 中的表达式无需运算，这就是短路
        if(age >=22 && gender == true){
            System.out.println("条件为真");
        }


        //三目运算符，
        //只有一个操作数的运算符， 一元运算符  ，    -num
        //有两个操作数        ， 二元运算符  ，   num1 + num2
        //有三各操作数（三目） ， 三元运算符  ，  flag = num1 > num2 ? "是" : "否"
        //取代简单的if...else...结构

        System.out.println(3/2);

        int num = 123;
        System.out.println(num/10);
        System.out.println(num%10);
        System.out.println((num%10)%10);
        System.out.println(num/10%10);
    }
}
