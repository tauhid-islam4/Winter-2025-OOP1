package com.dc.demo.functionoverloading;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public int subtract(int a, int b) {
       return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }

}
