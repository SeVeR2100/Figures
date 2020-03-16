package Figures.Objects;

import Figures.TwoDimention;

public class Parallelogram extends TwoDimention {
    private int sideA;
    private int sideB;
    private int hieght;

    public Parallelogram(int sideA, int sideB, int hieght) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.hieght = hieght;
    }

    @Override
    protected double perimeter() {
        return (2*sideA) + (2*sideB);
    }

    @Override
    protected double square() {
        return sideB*hieght;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", hieght=" + hieght +
                '}';
    }
}
