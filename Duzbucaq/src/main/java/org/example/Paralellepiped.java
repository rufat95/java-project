package org.example;

public class Paralellepiped extends Rectangle {
    private double height;

    public Paralellepiped(){}

    public Paralellepiped(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return super.area() * height;


    }
}
