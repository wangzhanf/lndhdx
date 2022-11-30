package vip.epss.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面的代码，确保他是一个spring组件，还需要声明为 方面的代码
@Component
@Aspect
public class CheckModel {

    //通过注解方式@Before告知将增强方法切入到什么位置【切入点】
    @Before("execution(int vip.epss.service.*.*(..))")
    public void checkCode(){
        System.out.println("进教室先检查健康码........");
    }

    //传统手工调用
//    public static void main(String[] args) {
//        CheckModel checkModel = new CheckModel();
//        checkModel.checkCode();
//    }
}
