package com.app.bookmyshow.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String city;
    private Integer pincode;
}
