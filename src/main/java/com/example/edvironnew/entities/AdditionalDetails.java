package com.example.edvironnew.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdditionalDetails {
    private String aadhar;
    private Person father;
    private Person mother;
    private Address address;

    // Constructors, getters, and setters

    // toString() method for debugging and logging
    @Override
    public String toString() {
        return "AdditionalDetails{" +
                "aadhar='" + aadhar + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", address=" + address +
                '}';
    }
}