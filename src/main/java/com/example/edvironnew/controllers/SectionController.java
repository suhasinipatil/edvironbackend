package com.example.edvironnew.controllers;

import com.example.edvironnew.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @GetMapping("/sections/{schoolName}")
    public Integer getSectionCountForSchoolName(@PathVariable String schoolName){
        return sectionService.getSectionCountForSchoolId(schoolName);
    }
}
