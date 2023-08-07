package com.example.edvironnew.entities;

/*public class StudentEntity {
}*/
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
import java.util.Date;

@Getter
@Setter
@Document(collection = "students") // Replace with the actual name of your MongoDB collection
public class StudentEntity {
    @Id
    private ObjectId id;

    private String name;
    @Field("phone_number")
    private String[] phoneNumber;
    @Field("edviron_id")
    private int edvironId;
    @Field("school_generated_id")
    private String schoolGeneratedId;
    @Field("school_id")
    private ObjectId schoolId;
    @Field("class")
    private String studentClass;
    private String section;
    private String category;
    private Date dob;
    private String gender;
    private int __v;
    @Field("previous_session_dues")
    private int previousSessionDues;
    private Date updatedAt;
    @Field("aadhaar_number")
    private String aadhaarNumber;
    @Field("father_name")
    private String fatherName;
    @Field("mother_name")
    private String motherName;
    private Address address;
    @Field("additional_details")
    private AdditionalDetails additionalDetails;

    // Constructors, getters, and setters

    public StudentEntity() {
    }

    // Add constructor with all fields if needed

    // Getters and Setters

    // toString() method for debugging and logging
    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + Arrays.toString(phoneNumber) +
                ", edvironId=" + edvironId +
                ", schoolGeneratedId='" + schoolGeneratedId + '\'' +
                ", schoolId=" + schoolId +
                ", studentClass='" + studentClass + '\'' +
                ", section='" + section + '\'' +
                ", category='" + category + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", __v=" + __v +
                ", previousSessionDues=" + previousSessionDues +
                ", updatedAt=" + updatedAt +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", address=" + address +
                ", additionalDetails=" + additionalDetails +
                '}';
    }
}
