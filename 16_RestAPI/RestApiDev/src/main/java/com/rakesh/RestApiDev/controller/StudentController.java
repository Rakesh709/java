package com.rakesh.RestApiDev.controller;


import com.rakesh.RestApiDev.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L,"Rakesh","rakesh@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L,"BUCKET","bucket@gmail.com");
    }

}
