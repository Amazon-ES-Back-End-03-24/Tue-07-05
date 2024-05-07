package com.ironhack.tue0705.model.vehicles;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.JOINED)

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Vehicle type")
//@DiscriminatorValue("VEHICLE")

public class Vehicle {

    @Id
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String petName;

    public Vehicle(String petName) {
        this.petName = petName;
    }


    public Vehicle() {}
}
