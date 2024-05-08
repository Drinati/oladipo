package com.cbfacademy.cars;

import java.util.*;

public class Showroom {
    
    public List<Car> getCars(){

    List<Car> cars = new ArrayList<Car>();
      
    cars.add(new Car("Volvo", "V40", "blue", 2012));
    cars.add(new Car("Porshe", "Panamera", "red", 2009));
    cars.add(new Car("Audi", "A3", "grey", 2018));

    
    return cars;

    
}
    
}
