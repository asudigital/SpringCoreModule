package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {

//    Instead of using class object let's use interface reference
//    Car car = null;
//    Bike bike;

    private Vehicle vehicle;

    @Autowired
    public Traveler(Vehicle vehicle){
//        this.car = new Car();
//        this.bike = new Bike();
        this.vehicle= vehicle;
    }


    public void startJourney(){
//       this.car.move();
//        this.bike.move();
        this.vehicle.move();
    }

}
