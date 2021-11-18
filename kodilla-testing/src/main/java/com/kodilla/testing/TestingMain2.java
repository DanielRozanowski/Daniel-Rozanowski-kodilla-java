package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;

public class TestingMain2 {





    public static void main(String[] args) {
        Calculator simpleMath = new Calculator(3, 2);

        Integer result = simpleMath.add();

        if (result.equals(5)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        result = simpleMath.subtract();

        if (result.equals(1)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}