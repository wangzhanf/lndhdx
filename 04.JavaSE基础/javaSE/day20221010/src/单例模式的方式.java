public class 单例模式的方式 {
    public static void main(String[] args) {
        /*Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1);
        System.out.println(p2);*/
       /* (new Pen()).getPen();*/
        Pen p1 = Pen.getPen();//通过静态的类方法获取实例对象
        Pen p2 = Pen.getPen();
        System.out.println(p1);
        System.out.println(p2);

        DBConn dbConn1 = DBConn.getDbConn();
        DBConn dbConn2 = DBConn.getDbConn();
        System.out.println(dbConn1);
        System.out.println(dbConn2);

    }
}
/*
* 饿汉式单例
* 缺陷：当类加载的时候就进行初始化，浪费内存。
* 优点：不会出现冲突【线程安全】。
* */
class Pen{//笔是公共的，而且只有一份
    private static Pen penInstance = new Pen();//实例对象成员
    private Pen(){//显式的定义私有构造函数
    }
    public static Pen getPen(){//static类方法只能直接调用static的方法和属性
        return penInstance;//this只能用在对象相关方法上
    }
}

/*
* 懒汉式单例
* 缺陷：产生冲突【线程不安全】
* 优势：内存消耗较小
* */
class DBConn{
    private static DBConn dbConn = null;//初始的时候无需创建对象
    private DBConn(){}
    public static DBConn getDbConn(){
        if(dbConn == null){
            dbConn = new DBConn();
        }
        return dbConn;
    }
}