package com.ikkadIT.CurdrpositoryMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.ikkadIT.CurdrpositoryMethods.Controller.StudentController;
import com.ikkadIT.CurdrpositoryMethods.entities.Student;

@SpringBootApplication
public class CurdrpositoryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CurdrpositoryMethodsApplication.class, args);
		StudentController studentController = context.getBean(StudentController.class);
//		Student stu=new Student();
//		stu.setSid(2);
//		stu.setSname("yuvansh");
//		stu.setSaddress("pune");
//		stu.setSemail("p@gmail.com");
//		stu.setSmarks(67);
//		stu.setSpass("123");
//		
//						Student stu1=new Student();
//		stu1.setSid(1);
//		stu1.setSname("yuvansh");
//		stu1.setSaddress("mum");
//		stu1.setSemail("p@gmail.com");
//		stu1.setSmarks(67);
//	stu1.setSpass("123");
//		
//		Student stu2=new Student();
//		stu2.setSid(2);
//		stu2.setSname("rudra");
//		stu2.setSaddress("kop");
//		stu2.setSemail("r@gmail.com");
//		stu2.setSmarks(78);
//		stu2.setSpass("123");
//		
//		Student stu3=new Student();
//		stu3.setSid(3);
//		stu3.setSname("piyu");
//		stu3.setSaddress("latur");
//		stu3.setSemail("p@gmail.com");
//		stu3.setSmarks(90);
//		stu3.setSpass("123");
//		
//		Student stu4=new Student();
//		stu4.setSid(4);
//		stu4.setSname("radha");
//		stu4.setSaddress("kagal");
//		stu4.setSemail("v@gmail.com");
//		stu4.setSmarks(48);
//		stu4.setSpass("678");
//		
//		Student stu5=new Student();
//		stu5.setSid(5);
//		stu5.setSname("radhaka");
//		stu5.setSaddress("kapashi");
//		stu5.setSemail("t@gmail.com");
//		stu5.setSmarks(48);
//		stu5.setSpass("678");
//		
//		Student stu6=new Student();
//		stu6.setSid(6);
//		stu6.setSname("lata");
//		stu6.setSaddress("hupari");
//		stu6.setSemail("v@gmail.com");
//		stu6.setSmarks(48);
//		stu6.setSpass("678");
//		List<Student> list=new ArrayList();
//		list.add(stu3);
//		list.add(stu1);
//		list.add(stu2);
//		list.add(stu4);
//		list.add(stu6);
//		list.add(stu5);
//		
//		studentController.saveAllStudent(list);
//		
//		Student student=studentController.getStudentById(1);
//		System.out.println(student);
		
		
		//List<Integer> list = new ArrayList();
//		list.add(2);
//	    list.add(3);
//		List<Student> studentsByMP = studentController.getStudentsByMP(list);
//		System.out.println(studentsByMP);
		
//		List<Student> findAllStudents = studentController.findAllStudents();
//	System.out.println(findAllStudents);

//		boolean checkRecord = studentController.checkRecord(4);
//		System.out.println(checkRecord);
//		long countNoOfREcords = studentController.countNoOfREcords();
//		System.out.println(countNoOfREcords);
//		String deleteRecordById = studentController.deleteRecordById(2);
//		System.out.println(deleteRecordById);
//		Page<Student> userPagination = studentController.userPagination();
//		System.out.println(userPagination);
//		for(Student u:userPagination) {
//			System.out.println(u);
			
		//}
	List<Student> sortingStudents = studentController.sortingStudents();
	System.out.println(sortingStudents);
	for(Student u:sortingStudents) {		
		System.out.println(u);
		
	}
	

	}
}

