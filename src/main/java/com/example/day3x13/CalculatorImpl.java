package com.example.day3x13;


import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println(a+"---"+b);
        return 0;
    }


}
