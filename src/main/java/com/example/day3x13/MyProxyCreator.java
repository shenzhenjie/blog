package com.example.day3x13;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;


public class MyProxyCreator implements BeanPostProcessor{

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        final Object obj=bean;
        if(bean instanceof Calculator){
            Object proxyobj = Proxy.newProxyInstance(
                    this.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        System.out.println("开始计算。。。。。");
                        Object result=method.invoke(obj,args);
                        System.out.println("结束计算。。。。。");
                        return result;
                    }

            );
            return proxyobj;
        }

        return obj;
    }


}
