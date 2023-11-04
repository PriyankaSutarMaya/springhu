package com.ikkadIT.CurdrpositoryMethods.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ikkadIT.CurdrpositoryMethods.Service.StudentServiceI;
import com.ikkadIT.CurdrpositoryMethods.entities.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;
	public String saveStudent(Student stu) {
		boolean saveStudent = studentServiceI.saveStudent(stu);
		if(saveStudent) {
			return "Student saved Successfully";
		}else {
		return "student not saved";
		
	}}
	public String saveAllStudent(List<Student> students) {
		 boolean saveAllStudent = studentServiceI.saveAllStudent(students);
		if(saveAllStudent) {
			return "All records saved successfully";
		}else {
		return "record not saved ";
	}
	
}
	@GetMapping
	public Student getStudentById(int sid) {
		Student student = studentServiceI.getStudentById(sid);
		return student;
	
		
		
	}
	public List<Student> getStudentsByMP(List<Integer> ids) {
		List<Student> studentsByMP = studentServiceI.getStudentsByMP(ids);
		return studentsByMP;
}
	public List<Student> findAllStudents() {
		List<Student> allRecords = studentServiceI.getAllRecords();
		return allRecords;
		

}
	public boolean checkRecord(int sid) {
		boolean checkRecord = studentServiceI.CheckRecord(sid);
		return checkRecord;
		
		}
	public long countNoOfREcords() {
		long countNoOfRecords = studentServiceI.countNoOfRecords();
		return countNoOfRecords;
		
	}
	public String deleteRecordById(int id) {
	 String deleteRecordById = studentServiceI.deleteRecordById(id);
		return deleteRecordById;
	}
	public Page<Student> userPagination() {
	
		 Page<Student> findAll = studentServiceI.userPagination();
		
		return findAll;
	}
	public List<Student> sortingStudents() {
		  List<Student> sortingStudent = studentServiceI.sortingStudent();
		
		return sortingStudent ;

		
		
	}
}


