package com.example.edvironnew.services;

import com.example.edvironnew.entities.DuesEntity;
import com.example.edvironnew.entities.SchoolEntity;
import com.example.edvironnew.entities.StudentEntity;
import com.example.edvironnew.repostories.StudentEntityRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentEntityRepository studentEntityRepository;

    @Autowired
    private DuesService duesService;

    @Autowired
    private SchoolService schoolService;

    public StudentService(StudentEntityRepository studentEntityRepository) {
        this.studentEntityRepository = studentEntityRepository;
    }

    public StudentEntity saveStudent(StudentEntity student){
        return studentEntityRepository.save(student);
    }

    public StudentEntity findById(ObjectId id){
        Optional<StudentEntity> student = studentEntityRepository.findStudentById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }

    public List<StudentEntity> getStudents(){
        List<StudentEntity> studentEntityList = new ArrayList<>();
        List<DuesEntity> duesEntityList = duesService.getDuesGreaterThanDate(new Date());
        for (DuesEntity dues: duesEntityList) {
            StudentEntity student = findById(dues.getStudent());
            if(student != null)
                studentEntityList.add(student);
        }
        return studentEntityList;
    }

    public Integer getStudentsSize(String name){
        Integer size = 0;
        List<SchoolEntity> schoolEntityList = schoolService.getSchools(name);
        for (SchoolEntity schoolEntity: schoolEntityList) {
            size += schoolEntity.getStudent_count();
        }
        return size;
    }
}
