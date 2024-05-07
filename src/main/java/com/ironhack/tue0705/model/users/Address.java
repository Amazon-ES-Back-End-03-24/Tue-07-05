package com.ironhack.tue0705.model.users;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String city;
    private String postcode;
    private int streetNumber;
}
