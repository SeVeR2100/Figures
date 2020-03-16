import Figures.Figures;
import Figures.Objects.*;
import Stack.MyStack;

public class Main {
    public static void main(String[] args)  {
        MyStack<Figures> myStack = new MyStack<Figures>();
        Triangle triangle1 = new Triangle(40, 32, 34, 10);
        myStack.push(triangle1);
        Rectangle rectangle1 = new Rectangle(23,43);
        myStack.push(rectangle1);
        Circle circle1 = new Circle(22);
        myStack.push(circle1);
        Parallelogram parallelogram1 = new Parallelogram(5,12,7);
        myStack.push(parallelogram1);
        Sphere sphere1 = new Sphere(19);
        myStack.push(sphere1);
        Cube cube1 = new Cube(6);
        myStack.push(cube1);
        RectangularBox rectangularBox = new RectangularBox(12,5,30);
        myStack.push(rectangularBox);

        int lenght = myStack.lenght();
        int l = lenght;
        System.out.println(lenght + " Objects in stack");
        for (int i = 0; i < lenght; i++){
            myStack.pop().getAll();
            int newLenght = --l;
            System.out.println(newLenght + " Objects in stack");
        }
        System.out.println("Stack is empty : " + myStack.isEmpty() );

    }
}
