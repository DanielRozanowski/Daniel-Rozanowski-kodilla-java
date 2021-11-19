package com.kodilla.testing.shape;


public class Circle implements Shape{
    private double r;

    public Circle (double r){
     this.r = r;
    }

    public String getShapeName(){
        return "circle";
    }

    @Override
    public double getField() {
        return r*r*3.14 ;
    }
}
