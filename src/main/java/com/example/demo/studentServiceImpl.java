package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.student;

import com.example.demo.repository.studentrepo;
import com.example.demo.service.studentService;

public abstract class studentServiceImpl implements studentService {
	
	@Autowired
	private studentrepo repo;

	@Override
	public student addStudent(student student) {
		return repo.save(student);
	}

	@Override
	public student updateStudent(Integer id, student student);{
		if(repo.existsById(id)) {
			student existingStudent = repo.findById(id).get();
		return repo.save(existingStudent);
		}
		else {
			return null;
		}
	}

	@Override
	public String deleteStudent(Integer id) {
		if(repo.existsById(id)) {
			student existingStudent = repo.findById(id).get();
			repo.delete(existingStudent);
			return 
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public student getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
