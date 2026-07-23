package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class studentdto {
	
	private String name;
	private String email;
	private String course;
	private String phone;
	private String address;
	private String gender;
	private String age;

}