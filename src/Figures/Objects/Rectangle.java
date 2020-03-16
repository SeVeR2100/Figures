package Figures.Objects;

import Figures.TwoDimention;

public class Rectangle extends TwoDimention {
    private int sideA;
    private int sideB;


    public Rectangle(int sideA,int sideB) {
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    protected double perimeter() {
        return (2*sideA)+(2*sideB);
    }

    @Override
    protected double square() {
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
