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

    public Integer getStudentsDefaultersForSchool(String name){
        Integer defaultersCount = 0;
        List<StudentEntity> studentEntityList = getStudents();
        SchoolEntity schoolEntity = schoolService.getSchool(name);
        for (StudentEntity student: studentEntityList) {
            if(student.getSchoolId() == schoolEntity.get_id())
                defaultersCount++;
        }
        return defaultersCount;
    }

    public Integer getStudentsSize(String name){
        Integer size = 0;
        SchoolEntity schoolEntity = schoolService.getSchool(name);
        return schoolEntity.getStudent_count();
    }
}
