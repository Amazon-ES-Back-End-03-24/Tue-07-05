package com.ironhack.tue0705.model.vehicles;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
//@DiscriminatorValue("CAR")
public class Car extends Vehicle{
    private int seats;

    public Car(String petName, int seats) {
        super(petName);
        this.seats = seats;
    }

    public Car() {}
}
