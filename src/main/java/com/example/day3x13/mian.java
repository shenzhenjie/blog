package com.example.day3x13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mian {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beanDefinition=applicationContext.getBeanDefinitionNames();

        ClassSWPoxyName c=new ClassSWPoxyName();
        c.getPoxyname();

    }

}
