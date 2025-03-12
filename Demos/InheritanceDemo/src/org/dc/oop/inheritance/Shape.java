package org.dc.oop.inheritance;

public abstract class Shape {
    private String color = "Black";
    private double area = 0.0;

    public Shape() {
        System.out.println("Inside Constructor of Shape");
    }

    public Shape(String color) {
        System.out.println("Color: Inside Constructor of Shape");
    }

    public Shape(String color, double area) {
        System.out.println("Color and Area : Inside Constructor of Shape");
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" + "\n" +
             "color='" + color + '\'' + "\n" +
             ", area=" + area + "\n" +
             '}';
    }
}
