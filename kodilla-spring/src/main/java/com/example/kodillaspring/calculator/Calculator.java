package com.example.kodillaspring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b){
        double result = a+b;
        display.displayValue(result);
        return result;
    }

    public double sub(double a, double b){
        double result = a-b;
        display.displayValue(result);
        return result;
    }

    public double mul(double a, double b){
        double result = a*b;
        display.displayValue(result);
        return result;
    }

    public double div(double a, double b){
        double result = a/b;
        display.displayValue(result);
        return result;
    }
}
