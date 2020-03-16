package Figures.Objects;

import Figures.ThreeDimention;

public class Sphere extends ThreeDimention {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    protected double square() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    protected double value() {
        return 4/3*Math.PI*radius*radius*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
}

