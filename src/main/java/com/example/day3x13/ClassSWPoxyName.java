package com.example.day3x13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassSWPoxyName {
    @Autowired
    private Calculator calculator;

    public void getPoxyname(){
        System.out.println(calculator.getClass().getName());
    }

}
