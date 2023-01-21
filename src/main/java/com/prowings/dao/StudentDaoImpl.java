package com.prowings.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.model.Student;
import com.prowings.repository.StudentRepository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private StudentRepository repository;
	



	@Override
	public Student createNewStudnet(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student getStudent(int roll) {
		return repository.findById(roll).get();
	}

	@Override
	public String deleteStudnet(int roll) {
		Student student = repository.findById(roll).get();
		repository.delete(student);
		return "Deleted";
	}

	@Override
	public Student updateStudent(Student studnet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student createNewStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

}
