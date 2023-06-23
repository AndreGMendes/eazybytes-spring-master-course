package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1 () {                       // Method name is the default name of the Bean
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2 () {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Bmw");
        return vehicle;
    }

    @Bean(name="mercedesVehicle")               // "name" This way we can override the name of the Bean
    Vehicle vehicle3 () {
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes");
        return vehicle;
    }

    @Primary
    @Bean(value="skodaVehicle")                 // "value" This way we can override the name of the Bean
    Vehicle vehicle4 () {
        var vehicle = new Vehicle();
        vehicle.setName("Skoda");
        return vehicle;
    }

    @Bean("volvoVehicle")                       // This way we can override the name of the Bean
    Vehicle vehicle5 () {
        var vehicle = new Vehicle();
        vehicle.setName("Volvo");
        return vehicle;
    }

}
