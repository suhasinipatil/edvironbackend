package com.example.edvironnew.services;

import com.example.edvironnew.entities.DuesEntity;
import com.example.edvironnew.entities.StudentEntity;
import com.example.edvironnew.repostories.DuesEntityRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DuesService {
    private final DuesEntityRepository duesEntityRepository;


    public DuesService(DuesEntityRepository duesEntityRepository) {
        this.duesEntityRepository = duesEntityRepository;
    }

    public DuesEntity saveDues(DuesEntity dues){
        return duesEntityRepository.save(dues);
    }

    public List<DuesEntity> getDuesGreaterThanDate(Date date){
        //List<DuesEntity> list = duesEntityRepository.findAll();
        return duesEntityRepository.findByDueDateGreaterThan(date);
    }
}
