package Figures.Objects;

import Figures.TwoDimention;

public class Triangle extends TwoDimention {
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height ) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.height=height;
    }

    @Override
    public double perimeter() {
        return sideA+sideC+sideB;
    }

    @Override
    public double square() {
        return 0.5*height*sideB;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", height=" + height +
                '}';
    }

}
