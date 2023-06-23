package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Audi");
        return vehicle;
    }

    @Bean
    Vehicle vehicle2 () {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Bmw");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3 () {
        var vehicle = new Vehicle();
        vehicle.setVehicleName("Mercedes");
        return vehicle;
    }

}
