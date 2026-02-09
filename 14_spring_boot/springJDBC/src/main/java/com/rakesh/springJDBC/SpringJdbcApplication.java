package com.rakesh.springJDBC;

import com.rakesh.springJDBC.model.Student;
import com.rakesh.springJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	     ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Rakesh");
		s.setMarks(99);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> student = service.getStudents();
		System.out.println(student);


	}

}
