package com.example.edvironnew.controllers;

import com.example.edvironnew.entities.DuesEntity;
import com.example.edvironnew.services.DuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class DuesController {

    @Autowired
    private DuesService duesService;

    @GetMapping("")
    public ResponseEntity<List<DuesEntity>> getDues(){
        List<DuesEntity> duesEntityList = duesService.getDuesGreaterThanDate(new Date());
        return ResponseEntity.ok(duesEntityList);
    }
}
