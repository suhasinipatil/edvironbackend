package com.example.edvironnew.entities;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document(collection = "sections")
public class SectionEntity {
    private String _id;
    private int __v;
    private String section_class;
    private Date createdAt;
    private int fine_after_grace_period;
    private int fine_grace_period;
    private int fine_per_day;
    private String school_id;
    private String section;
    private Date updatedAt;

    // Constructors, getters, and setters

    public SectionEntity() {
    }

    public SectionEntity(String _id, int __v, String section_class, Date createdAt, int fine_after_grace_period,
                        int fine_grace_period, int fine_per_day, String school_id, String section, Date updatedAt) {
        this._id = _id;
        this.__v = __v;
        this.section_class = section_class;
        this.createdAt = createdAt;
        this.fine_after_grace_period = fine_after_grace_period;
        this.fine_grace_period = fine_grace_period;
        this.fine_per_day = fine_per_day;
        this.school_id = school_id;
        this.section = section;
        this.updatedAt = updatedAt;
    }


}

