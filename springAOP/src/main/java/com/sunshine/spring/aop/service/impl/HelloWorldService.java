package com.sunshine.spring.aop.service.impl;


import com.sunshine.spring.aop.service.IHelloWorldService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-3-17
 * Time: ����3:06
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class HelloWorldService implements IHelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("============Hello World,This ia a aop test simple!");
    }

    @Override
    public void sayAnnoHello(String paras) {
        System.out.println("============Hello World,This ia a aop annotation test simple!");
    }
}
