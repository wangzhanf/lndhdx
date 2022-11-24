package first.second.third;

public class 面向对象综合案例 {
    public static void main(String[] args) {
        //创建两个游戏角色
        游戏者 赵云 = new 长弓战士();
        游戏者 鲁班 = new 医生();

        //pk
        游戏者[] A = new 游戏者[5];
        A[0]=赵云;
        A[1]=鲁班;
    }
}
class 游戏者{
    protected int 生命值 = 100;
}
interface 进攻{
    public static final String 职责描述 = "攻击对方阵型";
}
interface 防守{
    public static final String 职责描述 = "保护我方人员";
}
interface 治疗{
    public static final String 职责描述 = "恢复我方红蓝条";
}
class 长弓战士 extends 游戏者 implements 进攻{

}
class 骑士 extends 游戏者 implements 进攻{

}
class 盾牌战士  extends 游戏者 implements 防守{

}

interface  起死回生{

}
class 医生 extends 游戏者 implements 治疗,起死回生{
    public void addBlood(游戏者 p){
        if(p.生命值 == 0){
            //触发起死回生
            p.生命值 = 100;
        }
        p.生命值 += 2;

    }
}