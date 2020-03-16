package Figures.Objects;

import Figures.ThreeDimention;

public class RectangularBox extends ThreeDimention {
    private int sideA;
    private int sideB;
    private int sideC;

    public RectangularBox(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    protected double square() {
        return 2*(sideA*sideB+sideB*sideC+sideA*sideC);
    }

    @Override
    protected double value() {
        return sideA*sideB*sideC;
    }

    @Override
    public String toString() {
        return "RectangularBox{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
