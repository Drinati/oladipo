package com.cbfacademy.shapes;

public abstract class Shape {
    private double height;  
    protected double width;
    private String name;  

   public Shape(double area, String name2) {
        //TODO Auto-generated constructor stub
    }

public void setValues(double height, double width) {
      this.height = height;
      this.width = width;
   }

   public double getHeight() {
       return height;
   }
     

   public double getWidth() {
       return width;
   } 


   public double getArea(double area) {
    return area;
   }

   public String getName(){
   return name;
   }
}

