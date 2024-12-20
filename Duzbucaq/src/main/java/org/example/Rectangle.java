package org.example;

public class Rectangle {
    protected double width;
    protected double length;

    public Rectangle(){};

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area(){
        return width * length;
    }

    public double perimetre(){
        return 2*(width * length);
    }



}
