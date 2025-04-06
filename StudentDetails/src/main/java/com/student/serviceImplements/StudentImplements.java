	package com.student.serviceImplements;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;
	
	import org.modelmapper.ModelMapper;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.student.dto.StudentDTO;
	import com.student.entity.Student;
	import com.student.repository.StudentRepository;
	import com.student.service.StudentService;
	
	@Service
	public class StudentImplements implements StudentService{
	
		@Autowired
		private StudentRepository studentRepo;
		
		//Injecting ModelMapper
		@Autowired
		private ModelMapper modelMapper;
		
		@Override
		public Student createStudent(Student student) {
			return studentRepo.save(student);
		}
		//Here we use model mapper
		//Create student dto and save it
		@Override
		public StudentDTO createStudentDTO(StudentDTO dto) {
			 
	//		Student student = new Student();
	//		student.setName(dto.getName());
	//		student.setRollNo(dto.getRollNo());
	//		student.setEmail(dto.getEmail());
	//		student.setPassword(dto.getPassword());
	//		Student	saved=studentRepo.save(student);
	//		return maptoDTO(saved);
	//		OR
			//Converting DTO to entity using ModelMapper
			Student studen =modelMapper.map( dto, Student.class);
			
			//Save the entity to DB using JPA
			Student stu=studentRepo.save(studen);
			
			//Convert saved entity to the DTO and return it
		return modelMapper.map(stu, StudentDTO.class);
			
	//	StudentDTO responseDTO = new StudentDTO();--->by use of this we can use 2
	//	responseDTO.setName(student.getName());
	//	responseDTO.setEmail(student.getEmail());
	//	responseDTO.setRollNo(student.getRollNo());
	//	responseDTO.setPassword(student.getPassword());
	//		return responseDTO ;
		}
		@Override
		public StudentDTO getStudentById(Long id) {
			
			Student stu=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Id is not found please check id "));
			return maptoDTO(stu);
		}
		@Override
		public List<StudentDTO> getAllStudentList() {
			//map:-if list is there and we applied there map*2 then it create table of it
	//  1	return studentRepo.findAll().stream().map(this :: maptoDTO).collect(Collectors.toList());
	//		OR
	//	2	
			List<Student> stude=studentRepo.findAll();
			List<StudentDTO> dto=new ArrayList<>();
			for(Student student : stude) {
				StudentDTO stDTO= maptoDTO(student);  
				dto.add(stDTO);
			}
			return dto;
		}
		
		@Override
		public StudentDTO updateStudentDTO(Long id, StudentDTO dto) {
			Student student =studentRepo.findById(id).orElse(null);
			student.setName(dto.getName());
			student.setRollNo(dto.getRollNo());
			student.setEmail(dto.getEmail());
			student.setPassword(dto.getPassword());
	//	Student	updated=studentRepo.save(student);
			return maptoDTO(studentRepo.save(student));
			
	//	StudentDTO updateDTO = new StudentDTO();-->by use of this we can use 2
	//	updateDTO.setName(updated.getName());
	//	updateDTO.setEmail(updated.getEmail());
	//	updateDTO.setRollNo(updated.getRollNo());
	//	updateDTO.setPassword(updated.getPassword());
	//		return updateDTO ;
		}
		
		@Override
		public void deleteStudent(Long id) {
			
			 studentRepo.deleteById(id);
		}
		
		
		//we can create dto from student entity -->this is 2 method use there
		private StudentDTO maptoDTO(Student student) {
			StudentDTO	dto =new StudentDTO();
			dto.setName(student.getName());
			dto.setRollNo(student.getRollNo());
			dto.setEmail(student.getEmail());
			dto.setPassword(student.getPassword());
		
		    return dto;
		}
	
	}
