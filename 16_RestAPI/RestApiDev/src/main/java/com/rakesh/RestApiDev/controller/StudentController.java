package com.rakesh.RestApiDev.controller;


import com.rakesh.RestApiDev.dto.StudentDto;
import com.rakesh.RestApiDev.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

//    @GetMapping("/student")
//    public StudentDto getStudent(){
//        return new StudentDto(4L,"Rakesh","rakesh@gmail.com");
//    }


    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    @GetMapping("/student")
//    public List<Student> getStudent(){
//        return studentRepository.findAll();
//    }


    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L,"BUCKET","bucket@gmail.com");
    }

}
