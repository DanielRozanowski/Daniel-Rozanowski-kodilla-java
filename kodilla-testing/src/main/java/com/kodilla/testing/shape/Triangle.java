package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double a;
    private double h;

    public Triangle (double a, double h){
        a = a;
        h = h;
    }

    public String getShapeName(){
        return "Triangle";
    }

    @Override
    public double getField() {
        return a*h/2;
    }
}
