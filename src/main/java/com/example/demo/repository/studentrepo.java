package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.studentdto;
import com.example.demo.entity.student;


public interface studentrepo extends JpaRepository<studentdto, Integer> {

	student save(student student);

}