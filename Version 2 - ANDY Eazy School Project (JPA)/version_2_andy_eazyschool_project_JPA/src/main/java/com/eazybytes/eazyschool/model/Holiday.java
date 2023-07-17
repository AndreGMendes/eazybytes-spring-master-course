package com.eazybytes.eazyschool.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "holidays")
public class Holiday extends BaseEntity{

    @Id
    private /*final*/ String day;

    private /*final*/ String reason;

    @Enumerated(EnumType.STRING)
    private /*final*/ Type type;

    public enum Type {
        FESTIVAL, FEDERAL
    }

    /*public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

    public String getDay() {
        return day;
    }

    public String getReason() {
        return reason;
    }

    public Type getType() {
        return type;
    }*/
}
