package com.ironhack.tue0705.model.vehicles;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bicycles")
//@DiscriminatorValue("BICYCLE")
public class Bicycle extends Vehicle {
    private boolean hasBasket;

    public Bicycle(String petName, boolean hasBasket) {
        super(petName);
        this.hasBasket = hasBasket;
    }

    public Bicycle(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    public Bicycle() {}
}
