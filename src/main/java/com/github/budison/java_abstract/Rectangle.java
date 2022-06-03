package com.github.budison.java_abstract;

/**
 * @author Kevin Nowak
 */
class Rectangle extends Shape {
    protected double width;
    protected double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of abstract methods

    @Override
    double area() {
        return width * height;
    }

    @Override
    double circumference() {
        return 2 * (width + height);
    }
}
