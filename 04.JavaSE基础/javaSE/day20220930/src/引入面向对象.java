public class 引入面向对象 {
    public static void main(String[] args) {
        //创建一个子弹
        Point em = new Point();
        em.posX = 3;em.posY = 3;
        //创建一个自己
        Point self = new Point();
        self.posX = 7;self.posY = 6;
        //判断敌人和自己之间的距离, 典型的面向过程的描述思想
//        System.out.println(getDistance(em,self));
        //面向对象的实现，执行的操作应该是以自己为主语发生
        System.out.println(self.getDis(em));
    }
    public static double getDistance(Point em,Point self){
        double dis = (em.posX - self.posX)*(em.posX - self.posX) + (em.posY - self.posY)*(em.posY - self.posY);
        return dis;
    }
}

class Point{
    public int posX;
    public int posY;

    //我到底是否被击落取决于是否和其他点出现重合，
    public double getDis(Point em){
        double dis = (em.posX - this.posX)*(em.posX - this.posX) + (em.posY - this.posY)*(em.posY - this.posY);
        return dis;
    }
}
