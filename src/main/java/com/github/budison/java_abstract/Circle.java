package com.github.budison.java_abstract;

/**
 * @author Kevin Nowak
 */
class Circle extends Shape {
    private static final double PI = 3.1415;
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract methods

    @Override
    double area() {
        return PI * radius * radius;
    }

    @Override
    double circumference() {
        return 2 * PI * radius;
    }
}
