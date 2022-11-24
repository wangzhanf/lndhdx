public class 流程控制 {
    public static void main(String[] args) {
        //1 顺序结构
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        //
        /*oBtn.onclick = function(){
            console.log(1);
        }
        setTimeout(function(){console.log(1);},5000);
        console.log(2);
        */


        //2 选择
        boolean legStatus = true;//腿受伤的状态
        System.out.println("去食堂吃饭");
        //但分支，拦路石
        if(legStatus == false){
            System.out.println("绕过石头");
        }
        System.out.println("吃到美食");

        //双分支，
        String hobby = "苦";
        if (hobby != "甜"){
            System.out.println("来瓶白开水");
        }else{
            System.out.println("来瓶可乐");
        }

        //多分支
        float score = 95.5F;//考试分数
        if(score < 0 || score > 100){
            System.out.printf("成绩录入错误");
        }else{
            if(score >= 85){
                System.out.println("优秀");
            }else if(score >= 75){
                System.out.println("良好");
            }else if(score >= 60){
                System.out.println("及格");
            }else{
                System.out.println("不及格");
            }
        }


        //循环
       //3.1    死循环
        /*while(true){
            System.out.println("hello");//需要重复执行的语句
        }*/
        /*int count = 0;//停止循环的计数，一般采用整数
        while(true){
            if(count >= 10) {//停止循环的条件
                break;
            }
            if(count %3 == 0) {
                System.out.println("hello" + count);//需要重复执行的语句
                System.out.println("+++++++++++++++++++");
                continue;
            }
            //count 是3的倍数，输出一串 ++++++++++++++++++++
            System.out.println("-------------------");

            count = count + 1;//改变计数器状态
        }*/
        /*int count = 0;
        while(count++ < 10){

        }*/

/*
        int count = 0;//停止循环的计数，一般采用整数
        for(;;){
            if(count >= 10) {//停止循环的条件
                break;
            }
            if(count %3 == 0) {
                System.out.println("hello" + count);//需要重复执行的语句
                System.out.println("+++++++++++++++++++");
                continue;
            }
            //count 是3的倍数，输出一串 ++++++++++++++++++++
            System.out.println("-------------------");

            count = count + 1;//改变计数器状态
        }*/
        /*for(int i=0;i<10;i++){

        }*/
        System.out.println("hello\tworld");
    }
}
