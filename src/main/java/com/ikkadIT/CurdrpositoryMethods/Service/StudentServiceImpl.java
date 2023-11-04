package com.ikkadIT.CurdrpositoryMethods.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ikkadIT.CurdrpositoryMethods.entities.Student;
import com.ikkadIT.CurdrpositoryMethods.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentServiceI{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		Student student = studentRepository.save(stu);
		if (student != null) {
			return true;

		} else
			return false;
	}

	@Override
	public boolean saveAllStudent(List<Student> students) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(students);
		if(saveAll.isEmpty()) {
			return false;
		}else {
			
		
		return true;
	}
			
		
		
	
	}

	@Override
	public Student getStudentById(int sid) {
		 Student stu = studentRepository.findById(sid).get();
		return stu;
	}

	@Override
	public List<Student> getStudentsByMP(List<Integer> ids) {
		
			List<Student> findAll = (List<Student>) studentRepository.findAllById(ids);
			return findAll;
			
		
	}

	@Override
	public List<Student> getAllRecords() {
		List<Student> findstudents = (List<Student>) studentRepository.findAll();
		return findstudents;
		
	}

	@Override
	public boolean CheckRecord(int sid) {
		boolean existsById = studentRepository.existsById(sid);
		return existsById;
		
	
	}

	@Override
	public long countNoOfRecords() {
		long count = studentRepository.count();
		
		return count;
	}

	@Override
	public String deleteRecordById(int id) {
		boolean existsById = studentRepository.existsById(id);
		if(existsById){
			studentRepository.deleteById(id);
		return "Record Deleted";
		}else {
		
		return "Record not deleted";
	}
}

	@Override
	public Page<Student> userPagination() {
		PageRequest of = PageRequest.of(1, 5);
		Page<Student> findAll = studentRepository.findAll(of);
		return findAll;
	}

	@Override
	public List<Student> sortingStudent() {
		List<Student> findAll = studentRepository.findAll(Sort.by("smarks").ascending());
		
		return findAll ;
	}


}


	


