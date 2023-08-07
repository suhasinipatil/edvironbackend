package com.example.edvironnew.services;


import com.example.edvironnew.entities.SchoolEntity;
import com.example.edvironnew.repostories.SchoolEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {

    private final SchoolEntityRepository schoolEntityRepository;

    public SchoolService(SchoolEntityRepository schoolEntityRepository) {
        this.schoolEntityRepository = schoolEntityRepository;
    }

    public SchoolEntity getSchool(String name){
        Optional<SchoolEntity> schoolEntity = schoolEntityRepository.findSchoolEntityByNameEquals(name);
        if(schoolEntity.isPresent()){
            return schoolEntity.get();
        }
        return null;
    }
}
