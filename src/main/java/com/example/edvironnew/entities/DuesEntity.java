package com.example.edvironnew.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "dues") // Replace with the actual name of your MongoDB collection
public class DuesEntity {
    @Id
    private ObjectId id;

    @Field("fee_head")
    private ObjectId fee_Head;
    private ObjectId student;
    @Field("due_date")
    private Date due_Date;
    private Date timestamp;
    private int __v;

    // Constructors, getters, and setters

    public DuesEntity() {
    }

    public DuesEntity(ObjectId id, ObjectId feeHead, ObjectId student, Date dueDate, Date timestamp, int __v) {
        this.id = id;
        this.fee_Head = feeHead;
        this.student = student;
        this.due_Date = dueDate;
        this.timestamp = timestamp;
        this.__v = __v;
    }

    // Getters and Setters

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getFeeHead() {
        return fee_Head;
    }

    public void setFeeHead(ObjectId feeHead) {
        this.fee_Head = feeHead;
    }

    public ObjectId getStudent() {
        return student;
    }

    public void setStudent(ObjectId student) {
        this.student = student;
    }

    public Date getDueDate() {
        return due_Date;
    }

    public void setDueDate(Date dueDate) {
        this.due_Date = dueDate;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    // toString() method for debugging and logging
    @Override
    public String toString() {
        return "DuesEntity{" +
                "id=" + id +
                ", feeHead=" + fee_Head +
                ", student=" + student +
                ", dueDate=" + due_Date +
                ", timestamp=" + timestamp +
                ", __v=" + __v +
                '}';
    }
}

