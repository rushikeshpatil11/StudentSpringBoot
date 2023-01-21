package com.prowings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prowings.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{
	

}
