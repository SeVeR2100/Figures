import Figures.Figures;
import Figures.Objects.*;
import Stack.StackList;



public class Main {
    public static void main(String[] args)  {
        StackList <Figures> stackList = new StackList();
        Triangle triangle1 = new Triangle(40, 32, 34, 10);
        stackList.push(triangle1);
        Rectangle rectangle1 = new Rectangle(23,43);
        stackList.push(rectangle1);
        Circle circle1 = new Circle(22);
        stackList.push(circle1);
        Parallelogram parallelogram1 = new Parallelogram(5,12,7);
        stackList.push(parallelogram1);
        Sphere sphere1 = new Sphere(19);
        stackList.push(sphere1);
        Cube cube1 = new Cube(6);
        stackList.push(cube1);
        RectangularBox rectangularBox = new RectangularBox(12,5,30);
        stackList.push(rectangularBox);
        int l = stackList.lenght();

        for (int i = 0; i < l; i++){
            stackList.pop().getAll();
        }

//        for(Figures f : stackList ){
//            stackList.pop().getAll();
//      }

    }
}
