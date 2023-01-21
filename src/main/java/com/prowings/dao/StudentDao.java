package com.prowings.dao;

import java.util.List;

import com.prowings.model.Student;

public interface StudentDao {

	public Student createNewStudnet(Student student);

	public Student getStudent(int roll);

	public String deleteStudnet(int roll);

	public Student updateStudent(Student studnet);

	public List<Student> getAllStudents();

	public Student createNewStudent(Student student);

}
