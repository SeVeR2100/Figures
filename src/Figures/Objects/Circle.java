package Figures.Objects;

import Figures.TwoDimention;

public class Circle extends TwoDimention {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    protected double square() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
