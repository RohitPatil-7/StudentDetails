package com.student.service;

import java.util.List;

import com.student.dto.StudentDTO;
import com.student.entity.Student;

public interface StudentService {

	public Student createStudent(Student student);
	
	
	public StudentDTO createStudentDTO(StudentDTO dto);
	
	
	public StudentDTO getStudentById(Long id );
	
	public List<StudentDTO> getAllStudentList();
	
	public StudentDTO updateStudentDTO(Long id, StudentDTO dto);
	
	void deleteStudent(Long id);
	
	
	
}
