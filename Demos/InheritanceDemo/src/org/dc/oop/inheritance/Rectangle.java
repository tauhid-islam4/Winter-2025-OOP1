package org.dc.oop.inheritance;

public class Rectangle extends Shape{
    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /*public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }*/

    public Rectangle() {
        super("Blue");
        System.out.println("Inside Rectangle constructor");
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
             "length=" + length + "\n"+
             ", width=" + width + "\n"+
             ", area=" + getArea() + "\n"+
             ", perimeter=" + getPerimeter() + "\n"+
             "Color=" + getColor() +
             '}'+ "\n";
    }
}
