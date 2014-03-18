package com.sunshine.spring.aop.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-3-17
 * Time: ����3:07
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class HelloWorldAspect2 {

//    @Pointcut(value = "execution(* com.sunshine..IHelloWorldService) && args(paras)", argNames = "paras")
//    public void beforePointcut(String paras) {
////        System.out.println("============Hello World,This ia a aop test simple!,annoaition");
//    }
//
//    @Before(value = "beforePointcut(paras)", argNames = "paras")
//    //前置通知
//    public void beforeAdvice(String paras) {
//        System.out.println("===========annotation,before advice,param" + paras);
//    }

    @After(value = "beforePointcut(paras)", argNames = "paras")
    //后置最终通知
    public void afterFinallyAdvice(String paras) {
        System.out.println("===========annotation,after finally advice" + paras);
    }

    @Pointcut(value = "execution(* com.sunshine..*.sayAnnoHello(java.lang.String)) && args(param)", argNames = "param")
    public void beforePointcut(String param) {
    }

    @Before(value = "beforePointcut(param)", argNames = "param")
    public void beforeAdvice(String param) {
        System.out.println("===========annotation before advice param:" + param);
    }
}
