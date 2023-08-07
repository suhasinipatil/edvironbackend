package com.example.edvironnew.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.example.edvironnew.entities.StudentEntity;
import com.example.edvironnew.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LambdaHandler implements RequestHandler<Object, Object> {

    @Autowired
    private StudentService studentService;

    @Override
    public Object handleRequest(Object input, Context context) {
        List<StudentEntity> studentEntityList = studentService.getStudents();
        return studentEntityList;
    }
}

