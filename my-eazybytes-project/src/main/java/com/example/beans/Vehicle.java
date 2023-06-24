package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Vehicle {

    private String model;
    private String brand;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle() {
        this.brand = "Model: " + "skoda".toUpperCase();
    }

    @PostConstruct
    public void initialize() {
        this.model = "Brand: " + "fabia".toUpperCase();
    }

    public void specifyVehicle(String brand) {

        switch (brand) {
            case "vehicle1" :
                this.brand = "skoda".toUpperCase();
                this.model = "fabia".toUpperCase();
            break;
            case "vehicle2" :
                this.brand = "rover".toUpperCase();
                this.model = "evoke".toUpperCase();
            break;
            default :
                this.brand = "lamborghini".toUpperCase();
                this.model = "diablo".toUpperCase();
        }
    }



}
