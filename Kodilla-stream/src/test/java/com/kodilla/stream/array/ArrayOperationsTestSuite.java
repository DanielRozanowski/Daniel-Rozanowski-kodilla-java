package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    void ArrayOperationsTestSuite (){
        //Given
        int[] numbers = new int[20];
        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 5;
        numbers[4] = 2;
        numbers[5] = 7;
        numbers[6] = 8;
        numbers[7] = 9;
        numbers[8] = 5;
        numbers[9] = 4;
        numbers[10] = 8;

        //When
        double expected = ArrayOperations.getAverage(numbers);
        //Then
        Assertions.assertEquals(expected, 3.05);
    }
}