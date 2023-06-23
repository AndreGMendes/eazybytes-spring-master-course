package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.invoke.VarHandle;
import java.util.Locale;

public class example1 {

    final static String NOTE_FROM_SPRING_IOC = " was created from within the IOC container in the Spring Framework.";


    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicleA = (Vehicle) context.getBean("vehicle1", Vehicle.class);
        System.out.println(vehicleA.getName().toUpperCase() + NOTE_FROM_SPRING_IOC);

        Vehicle vehicleB = (Vehicle) context.getBean("vehicle2");
        System.out.println(vehicleB.getName().toUpperCase() + NOTE_FROM_SPRING_IOC);

        Vehicle vehicleC = (Vehicle) context.getBean("mercedesVehicle", Vehicle.class);
        System.out.println(vehicleC.getName().toUpperCase() + NOTE_FROM_SPRING_IOC);

        Vehicle vehicleD = (Vehicle) context.getBean("skodaVehicle", Vehicle.class);
        System.out.println(vehicleD.getName().toUpperCase() + NOTE_FROM_SPRING_IOC);

        Vehicle vehicleE = (Vehicle) context.getBean("volvoVehicle", Vehicle.class);
        System.out.println(vehicleE.getName().toUpperCase() + NOTE_FROM_SPRING_IOC);
    }


}
