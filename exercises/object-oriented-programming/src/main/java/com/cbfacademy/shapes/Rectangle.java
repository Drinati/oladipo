package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        super();
        
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

}