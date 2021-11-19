package com.kodilla.testing.ShapeCollector;


import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

public class ShapeTestSuite {

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

    @DisplayName("Should add Figure.")
    @Test
     void testAddFigure(){
        //Given
        Circle circle = new Circle(2);
        Square square = new Square(10);
        Triangle triangle = new Triangle(10 , 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        //Then
        Assertions.assertEquals(3 , shapeCollector.quantiti());

    }

    @DisplayName("Should remove Figure.")
    @Test
    void testRemoveFigure(){
        //Given
        Circle circle = new Circle(2);
        Square square = new Square(10);
        Triangle triangle = new Triangle(10 , 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);

        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(triangle);
        shapeCollector.removeFigure(square);

        //Then
        Assertions.assertEquals(0 , shapeCollector.quantiti());

    }


    @DisplayName("Should show Figures.")
    @Test
    void testShowFigures(){
        //Given
        Circle circle = new Circle(2);
        Square square = new Square(10);
        Triangle triangle = new Triangle(10 , 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);



        //Then
        shapeCollector.showFigures();

    }
    @DisplayName("Should get Figure.")
    @Test
    void testGetFigure(){
        //Given
        Circle circle = new Circle(2);
        Square square = new Square(10);
        Triangle triangle = new Triangle(10 , 5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);

        //Then
        Shape shape = shapeCollector.getFigure(0);
        Assertions.assertEquals(circle , shape );


    }



}
