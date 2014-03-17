package com.sunshine.spring.aop.aspect;


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-3-17
 * Time: ����3:07
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldAspect {

    //前置通知
    public void beforeAdvice( ) {
        System.out.println("===========before advice");
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
