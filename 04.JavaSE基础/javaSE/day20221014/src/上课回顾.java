import java.util.ArrayList;
import java.util.List;

public class 上课回顾 {
    //框架集合: 成套的容器工具，List，Set，Map
    public static void main(String[] args) {
//        List<Number> nums = new ArrayList<>();
        MyArrayList<Integer> mal = new MyArrayList();//我的容器
        System.out.println(mal.size());
        System.out.println(mal.isEmpty());
        mal.add(1);
        mal.add(2);
        mal.add(3);
        mal.add(4);
        System.out.println(mal.size());
        System.out.println(mal.isEmpty());
        Object a = mal.pop();
    }
}

//如何实现自己的容器
interface MyContainer{
    public abstract int size();//获取容器的元素个数
    boolean isEmpty();//判断容器是否为空
//    void add(Object obj);//添加的方法
}
class MyArrayList<T> implements MyContainer{
    private  Object[] eleData = new Object[3];//初始空间大小3
    private int spaceNum = 3;
    private int nSize = 0;//初始元素个数是0

    @Override
    public int size(){
        return this.nSize;
    }

    @Override
    public boolean isEmpty() {
        return this.nSize == 0;
    }

//    @Override
    public void add(Object obj) {
        /*if(this.nSize >= this.spaceNum){//没空间
            Integer[] temp = new Integer[2 * spaceNum];//开辟新空间
            for (int i = 0; i < this.eleData.length; i++) {
                temp[i] = this.eleData[i];
            }
            this.eleData = temp;
        }*/
        flex();
        this.eleData[nSize] = obj;
        nSize++;
    }

    private void flex(){
        if(this.nSize >= this.spaceNum || --this.nSize <= this.spaceNum/2){
            Object[] temp = new Object[1];
            if(this.nSize >= this.spaceNum){//没空间
                temp = new Object[2 * spaceNum];//开辟新空间
            }
            if(this.nSize - 1  <= this.spaceNum/2){
                temp = new Object[spaceNum/2];//开辟新空间
            }
            for (int i = 0; i < this.eleData.length; i++) {
                temp[i] = this.eleData[i];
            }
            this.eleData = temp;
        }

    }

    public Object pop(){
        Object ret = this.eleData[this.nSize - 1];
        flex();
        this.nSize --;
        return ret;
    }

    public Object get(int index){
        if(index < 0 || index > nSize){
            index = 0;
        }
        return this.eleData[index];
    }

}