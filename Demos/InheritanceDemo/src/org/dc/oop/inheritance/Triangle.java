package org.dc.oop.inheritance;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle() {
        super("Yellow");
        System.out.println("Triangle constructor");
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    @Override
    public double getPerimeter() {
        return (Double.MAX_VALUE - Double.MIN_VALUE)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
             "base=" + base + "\n"+
             ", height=" + height + "\n"+
             ", area=" + getArea() + "\n"+
             ", perimeter=" + getPerimeter() + "\n"+
             "Color = " + getColor() +
             '}'+ "\n";
    }
}
