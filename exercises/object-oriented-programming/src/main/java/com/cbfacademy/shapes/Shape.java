package com.cbfacademy.shapes;

public abstract class Shape {
  
    public abstract String getName();
    public abstract double getArea();
    }

        public abstract class Shape implements ShapeInterface{
  
            public String name;
             
            public Shape(String name) {
            this.name=name;
            }
              
            public String getName(){
            return name;
            }
             
            public abstract double getArea();
            
        }



