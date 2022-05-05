package com.example.kodillaspring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.mul(2,2);
        double result1 = calculator.sub(10,5);
        double result2 = calculator.div(10,5);
        double result3 = calculator.add(5,5);

        //Then
        assertEquals(result,4);
        assertEquals(result1,5);
        assertEquals(result2,2);
        assertEquals(result3,10);
    }
}
