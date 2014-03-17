package com.sunshine.spring.aop.aspect;


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
@Aspect()
public class HelloWorldAspect2 {

    @Pointcut(value="execution(* com.sunshine.spring.aop.service.impl.HelloWorldService.beforePointcut(..)) && args(paras)", argNames = "paras")
    public void beforePointcut(String paras) {
        System.out.println("============Hello World,This ia a aop test simple!,annoaition");
    }

    @Before(value = "beforePointcut(param)", argNames = "param")
    //前置通知
    public void beforeAdvice(String param ) {
        System.out.println("===========before advice,"+param);
    }

    //后置最终通知
    public void afterFinallyAdvice( ) {
        System.out.println("===========after finally advice");
    }

    public void afterAdvice(  ) {

    }

    public void afterThrowable(String info ) {

    }

    public void around( ) {
        System.out.println("===========round advice");
    }
}
