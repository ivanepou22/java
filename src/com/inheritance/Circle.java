package com.inheritance;

public class Circle {
    private double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        if (radius < 0) radius = 0;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * PI);
    }
}
