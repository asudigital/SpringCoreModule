package com.spring.core;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core")
public class   AppConfig {

    //creating spring bean
    // returning instance of a car
    //creating the object of class manually

//    JAVA BASED CONFIGURATION
//    @Bean
//    public Vehicle car(){
//        return new Car();
//    }
//    @Bean
//    public Vehicle bike(){
//        return new Bike();
//    }
//    @Bean
//    public Vehicle cycle(){
//        return new Cycle();
//    }
//@Bean
//    public Traveler trav() {
//        return new Traveler( bike()); //DI
//    }


}
