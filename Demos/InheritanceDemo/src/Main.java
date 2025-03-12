import org.dc.oop.inheritance.*;

import java.sql.SQLOutput;
import java.util.concurrent.TransferQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Shape shape = new Circle();

        Circle circle = new Circle();
        circle.setRadius(5);
        Triangle triangle = new Triangle();
        triangle.setBase(8);
        triangle.setHeight(6);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(3);

        System.out.println("Circle: " + circle);
        System.out.println("Triangle: " + triangle);
        System.out.println("Square: " + square);
        System.out.println("Rectangle: " + rectangle);


    }
}