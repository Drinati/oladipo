package com.cbfacademy.shapes;

public class Sphere extends Shape {

    double radius;
    private double area;

    public Sphere (double area, String name, double radius) {
        super();

        this.radius = radius;
        this.area = (4* 3.142 * (radius*radius));
    }
    public double getArea() {
        return this.area;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
