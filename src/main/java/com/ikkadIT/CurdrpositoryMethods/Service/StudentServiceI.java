package com.ikkadIT.CurdrpositoryMethods.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ikkadIT.CurdrpositoryMethods.entities.Student;


public interface StudentServiceI{
	
	public boolean saveStudent(Student stu);
	public boolean saveAllStudent(List<Student>students);
	public Student getStudentById(int sid);
	public List<Student> getStudentsByMP(List<Integer> ids);
	public List<Student> getAllRecords();
	public boolean CheckRecord(int sid);
	public long countNoOfRecords();
	public String deleteRecordById(int id);
	public Page<Student> userPagination();
	public List<Student> sortingStudent();
	
	



}
