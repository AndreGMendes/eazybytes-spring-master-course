package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1 () {
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

    @Bean(name="mercedesVehicle")
    Vehicle vehicle3 () {
        var vehicle = new Vehicle();
        vehicle.setName("Mercedes");
        return vehicle;
    }

}
