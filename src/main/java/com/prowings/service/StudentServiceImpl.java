package com.prowings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.StudentDao;
import com.prowings.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;

	@Override
	public Student createNewStudnet(Student student) {
		return dao.createNewStudent(student);
	}

	@Override
	public Student getStudent(int roll) {
		return dao.getStudent(roll);
	}

	@Override
	public String deleteStudnet(int roll) {
		return dao.deleteStudnet(roll);
	}

	@Override
	public Student updateStudent(Student studnet) {
		return dao.updateStudent(studnet);
	}

	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	

}
