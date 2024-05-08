package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        super(width, length)
        
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        // A = w * l
        return width * length;
    }

}