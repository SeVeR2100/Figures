package Figures.Objects;

import Figures.ThreeDimention;

public class Cube extends ThreeDimention {
    private int side;

    public Cube(int side) {
        this.side = side;
    }
    @Override
    protected double square() {
        return 6*side*side;
    }

    @Override
    protected double value() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}
