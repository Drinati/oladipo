package com.cbfacademy.shapes;

public class Sphere extends Shape {

    double radius;
    private double area;

    public Sphere (double area, String name, double radius) {
        super(area, name);

        this.radius = radius;
        this.area = (4* 3.142 * (radius*radius));
    }
    public double getArea() {
        return this.area;
    }
}
