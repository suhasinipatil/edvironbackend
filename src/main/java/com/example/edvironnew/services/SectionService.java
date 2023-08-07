package com.example.edvironnew.services;

import com.example.edvironnew.repostories.SectionEntityRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {

    private final SectionEntityRepository sectionEntityRepository;

    @Autowired
    private SchoolService schoolService;
    public SectionService(SectionEntityRepository sectionEntityRepository) {
        this.sectionEntityRepository = sectionEntityRepository;
    }

    public Integer getSectionCountForSchoolId(String schoolName){
        ObjectId id = schoolService.getSchool(schoolName).get_id();
        return sectionEntityRepository.findSectionEntityBySchool_idIs(id).size();
    }
}
