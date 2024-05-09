package com.cbfacademy.shapes;


public class paint {
   @SuppressWarnings("unused")
private double coverage;
   public paint(double c) 
{
    coverage = c;
}
public double amount (Shape s) {
    System.out.println ("computing amount for " + s);
    return 0;
}
}