package Figures;

public abstract class ThreeDimention extends Figures {
    protected abstract double square();
    protected abstract double value();
    public void getAll() {
        System.out.println(toString() +"\n"+ "Value is: " + value() + " Square is : " + square() + "\n");
    }
}
