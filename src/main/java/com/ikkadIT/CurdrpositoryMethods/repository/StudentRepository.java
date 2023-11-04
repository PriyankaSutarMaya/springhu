package com.ikkadIT.CurdrpositoryMethods.repository;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ikkadIT.CurdrpositoryMethods.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	




	

}
