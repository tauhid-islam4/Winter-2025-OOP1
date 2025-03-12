package org.dc.oop.inheritance;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        this.side = side;
        System.out.println("Inside Square");
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
             "side=" + side + "\n"+
             "Area=" + getArea() + "\n"+
             "Perimeter=" + getPerimeter() + "\n"+
             "Color=" + getColor() + "\n"+
             '}'+ "\n";
    }
}
