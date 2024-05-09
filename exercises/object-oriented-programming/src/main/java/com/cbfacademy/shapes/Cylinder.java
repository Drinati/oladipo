package com.cbfacademy.shapes;

public class Cylinder extends Shape {

        private double area;
        private double radius2;
      
        public Cylinder(double radius, double height) {
          super(radius);
          this.area =  (height * Math.PI * (radius2));
        }
      
      
        @Override
        public double getArea() {
         return this.area;
        }
      }
