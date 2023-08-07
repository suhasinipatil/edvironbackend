package com.example.edvironnew.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankDetails {
    private String account_number;
    private String ifsc;
    private String account_holder;

    public BankDetails() {
    }

    public BankDetails(String account_number, String ifsc, String account_holder) {
        this.account_number = account_number;
        this.ifsc = ifsc;
        this.account_holder = account_holder;
    }

    // Getters and setters
    // ...
}
