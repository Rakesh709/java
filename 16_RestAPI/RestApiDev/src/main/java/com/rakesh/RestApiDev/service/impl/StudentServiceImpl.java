package com.rakesh.RestApiDev.service.impl;

import com.rakesh.RestApiDev.dto.StudentDto;
import com.rakesh.RestApiDev.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {
    @Override
    public List<StudentDto> getAllStudents() {
        return List.of();
    }
}
