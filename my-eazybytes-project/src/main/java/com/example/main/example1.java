package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example1 {

    final static String NOTE_FROM_SPRING_IOC = " was created from within the IOC container in the Spring Framework.";


    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getModel());

        vehicle.specifyVehicle("vehicle1");
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Model: " + vehicle.getModel());

        vehicle.specifyVehicle("vehicle2");
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Model: " + vehicle.getModel());

        vehicle.specifyVehicle("");
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Model: " + vehicle.getModel());

        context.close();

    }


}
