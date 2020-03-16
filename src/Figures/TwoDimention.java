package Figures;

public abstract class TwoDimention extends Figures {
    protected abstract double perimeter();
    protected abstract double square();
    public void getAll() {
        System.out.println(toString() +"\n"+ "Perimeter is: " + perimeter() + " Square is : " + square() + "\n");
    }

}
