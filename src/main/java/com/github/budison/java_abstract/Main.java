package com.github.budison.java_abstract;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(1.0, 3.0));
        shapes.add(new Rectangle(4.0, 2.0));

        double totalArea = shapes.stream().mapToDouble(Shape::area).sum();
        System.out.println(totalArea);
    }
}	
