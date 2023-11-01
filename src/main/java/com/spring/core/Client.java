package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

  public static void main(String[] args)
  {
//      Vehicle vehicle = new Car();
//
//      Traveler traveler = new Traveler(vehicle);
//      traveler.startJourney();

      //creating  spring IOC container
      //Read the configuration class
      //crete and the spring beans
      ApplicationContext applicationContext= new AnnotationConfigApplicationContext(AppConfig.class);

      //Retrieve Spring Beans from Spring IOC Container
      Car car = applicationContext.getBean(Car.class);
      car.move();

      Bike bike = applicationContext.getBean(Bike.class);
      bike.move();

      //we have injected a car dependancy in a traveller
      Traveler trav = applicationContext.getBean(Traveler.class);

      trav.startJourney();
  }
}
