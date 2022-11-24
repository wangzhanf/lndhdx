/*# 课堂练习：创建一个车的类Car，拥有属性 maxSpeed， price  .
默认值分别是  200，10.0F，
# 通过showMe方法展示该车的基本信息， 创建空参和带参构造函数，
创建一个方法可以进行两辆车的比较   compar (Car car)    ,
在主函数中使用匿名对象完成业务*/
public class 课堂练习 {
    public static void main(String[] args) {
        Car self = new Car(40, 9);
        self.showMe();
        System.out.println(self.compar(new Car()));
        System.out.println(self.compar(new Car(40,8)));

    }
}
class Car{
    private int maxSpeed = 200;
    private Float price = 10.0F;//包装类和基本类型，自动封包和拆包
    public Car(){}
    public Car(int maxSpeed,float price){
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void showMe() {
        System.out.println("Car{" +
                "maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}'); ;
    }
    public int compar(Car other){
        int flag = 0;
        if(this.maxSpeed > other.maxSpeed){
            flag =  1;
        }else if(this.maxSpeed == other.maxSpeed){
            flag = this.price > other.price ? 1 : -1;
        }else{
            flag = -1;
        }
        return flag;
    }
}