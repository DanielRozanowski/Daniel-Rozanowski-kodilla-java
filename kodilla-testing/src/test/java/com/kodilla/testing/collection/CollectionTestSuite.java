package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("when create OddNumbersExterminator with ArrayList, " +
            "then result should return null"
    )
    @Test
     void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> normalTestList = (ArrayList<Integer>) exterminator.exterminate(new ArrayList<Integer>(emptyList));
        //Then
        Assertions.assertEquals(0 , normalTestList.size());

    }
    @DisplayName("when create OddNumbersExterminator with List, " +
            "then OddNumbersExterminator should return correct normalTestList"
    )
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(4);
        normalList.add(7);
        normalList.add(8);
        normalList.add(11);
        normalList.add(13);
        normalList.add(16);
        normalList.add(18);
        normalList.add(19);
        // List exsceptet
        List<Integer> exceptetList = new ArrayList<>();
        normalList.add(4);
        normalList.add(8);
        normalList.add(16);
        normalList.add(19);
        //When
        List<Integer> normalTestList =  exterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(4, normalTestList.size());
        Assertions.assertEquals(exceptetList , normalTestList);


    }
}
