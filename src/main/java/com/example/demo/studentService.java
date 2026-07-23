package com.example.demo.service;

import com.example.demo.entity.student;

public interface studentService {
	
	
	public student addStudent(student student);
	public student updateStudent(Integer id, student student);
	public String deleteStudent(Integer id);
	public student getStudentById(Integer id);
	public student getAllStudent();
	
	
	

}
