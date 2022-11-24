package intdemo;

import java.io.Serializable;

public interface Runable {
}

interface USB{
    public abstract void transferData();//
    default public void test(){
        System.out.println("接口提供的默认方法");
    }
}


class 电子设备{
    protected double vValue;
}
//多实现
/*class 计算机 extends 电子设备 implements USB,Runable, Serializable{
    private int cpuNumber;
    public 计算机(){
        this.vValue = 3.5F;
        this.cpuNumber = 1;
    }
}*/

class 手机 extends 电子设备 implements USB{
    public void transferData(){
        System.out.println("手机传输数据");
    }

    @Override
    public void test() {
        USB.super.test();
        System.out.println("子类覆写了接口中的默认方法");
    }


}