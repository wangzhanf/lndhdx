package vip.epss.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面的代码，确保他是一个spring组件，还需要声明为 方面的代码
@Component
@Aspect
public class DataTransaction {
    private Integer i = 1;
    //定义统一的切入点，可以复用代码
    @Pointcut("execution(* vip.epss.service.impl.*Impl.*(..))")
    private void definePointCut(){
        //不做工作，统一切入点的描述信息
        System.out.print(this.i++);
    }

    //通过注解方式@Before告知将增强方法切入到什么位置【切入点】
    //前置通知
    @Before("definePointCut()")
    public void beginTransaction(JoinPoint joinPoint){
        System.out.println("@Before     ........" + joinPoint);
    }

    //后置通知
    @After("definePointCut()")
    public void endTransaction(JoinPoint joinPoint){
        System.out.println("@After   ........" + joinPoint);
    }

    //后置返回通知
    @AfterReturning(value = "definePointCut()",returning = "ret")
    public void retAfter(JoinPoint joinPoint,Object ret){
        System.out.println("@AfterReturning   ........" + joinPoint + (Integer)ret*(Integer)ret);
    }

    //环绕通知, 注意需要返回对象， 将需要处理的对象 ProceedingJoinPoint 作为环绕通知的第一个参数
    @Around("definePointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            System.out.println("@Around  before ........");
            proceed = proceedingJoinPoint.proceed(); //调用了切入方法的处理业务 deleteByPrimaryKey
            System.out.println("@Around  after ........");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }


        return proceed;
    }

    //异常通知
    @AfterThrowing("definePointCut()")
    public void afterThrow(){
        System.out.println("@AfterThrowing    ........");
    }

    //传统手工调用
//    public static void main(String[] args) {
//        CheckModel checkModel = new CheckModel();
//        checkModel.checkCode();
//    }
}
