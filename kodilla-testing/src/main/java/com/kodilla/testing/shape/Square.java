package com.kodilla.testing.shape;

public class Square implements Shape{
    private double a;

    public Square (double a){
        a = a;
    }
    public String getShapeName(){
        return "square";
    }

    @Override
    public double getField() {
        return a*a;
    }
}
