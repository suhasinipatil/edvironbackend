package com.example.edvironnew.entities;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "schools")
public class SchoolEntity {
    private ObjectId _id;
    private String name;
    private int edviron_id;
    private Address address;
    private BankDetails bank_details;
    private String phone_number;
    private String email_id;
    private String logo_url;
    private String school_type;
    private int student_count;
    private int fee_collection_date;
    private int late_fee_grace_period;
    private int late_fee;
    private Date createdAt;
    private Date updatedAt;
    private int __v;

    // Constructors, getters, and setters

    public SchoolEntity() {
    }

    public SchoolEntity(ObjectId _id, String name, int edviron_id, Address address, BankDetails bank_details,
                        String phone_number, String email_id, String logo_url, String school_type,
                        int student_count, int fee_collection_date, int late_fee_grace_period, int late_fee,
                        Date createdAt, Date updatedAt, int __v) {
        this._id = _id;
        this.name = name;
        this.edviron_id = edviron_id;
        this.address = address;
        this.bank_details = bank_details;
        this.phone_number = phone_number;
        this.email_id = email_id;
        this.logo_url = logo_url;
        this.school_type = school_type;
        this.student_count = student_count;
        this.fee_collection_date = fee_collection_date;
        this.late_fee_grace_period = late_fee_grace_period;
        this.late_fee = late_fee;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.__v = __v;
    }
}
