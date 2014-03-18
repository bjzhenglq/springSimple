spring aop info
spring中aop namespace的handler是AopNamespaceHandler。
其初始化代码如下(init方法调用的时机在上一篇分析事务时已经分析过了):

public void init() {
        // In 2.0 XSD as well as in 2.1 XSD.
        registerBeanDefinitionParser("config", new ConfigBeanDefinitionParser());
        registerBeanDefinitionParser("aspectj-autoproxy", new AspectJAutoProxyBeanDefinitionParser());
        registerBeanDefinitionDecorator("scoped-proxy", new ScopedProxyBeanDefinitionDecorator());

        // Only in 2.0 XSD: moved to context namespace as of 2.1
        registerBeanDefinitionParser("spring-configured", new SpringConfiguredBeanDefinitionParser());
    }
 从中可以看到，aop:config标签的解析类是：ConfigBeanDefinitionParser
