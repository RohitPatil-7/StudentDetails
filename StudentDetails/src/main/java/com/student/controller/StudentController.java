package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDTO;
import com.student.entity.Student;
import com.student.serviceImplements.StudentImplements;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentImplements studentImp;
@PostMapping("/save")
	public Student saveStudent (@RequestBody Student student) {
		return studentImp.createStudent(student);
	}
	
@PostMapping("/saveDTO")
public StudentDTO saveStudentDTO (@RequestBody StudentDTO dto) {
	return studentImp.createStudentDTO(dto);
}

@PutMapping("/updateDTO/{id}")
public StudentDTO updateStudentDTO (@PathVariable Long id,@RequestBody StudentDTO dto) {
	return studentImp.updateStudentDTO(id, dto);
}


}
