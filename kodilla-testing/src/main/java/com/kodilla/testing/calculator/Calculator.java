package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int add(){
        int sum = a + b;
        return sum;

    }

    public int subtract(){
        int difference = a - b;
        return  difference;

    }


}
