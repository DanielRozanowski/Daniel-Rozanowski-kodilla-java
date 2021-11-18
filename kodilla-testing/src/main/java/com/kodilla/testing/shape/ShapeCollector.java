package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    private List<Shape> shapeCollection = new ArrayList<>();
    public void addFigure(Shape shape){
        shapeCollection.add(shape);


    }

    public void removeFigure(Shape shape){
        shapeCollection.remove(shape);

    }

    public Shape getFigure(int n){
        return shapeCollection.get(n);

    }

    public void showFigures() {
        for(Shape shape:shapeCollection){
            System.out.println(shape);
        }


    }
    public int quantiti() {
        return shapeCollection.size();
    }


}
