package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

	// Retrieving the non-primary key data
	
	public List<Student> findByGender(String gender);
	
	

	public List<Student> findByGenderAndSchool(String gender, String school);
	
}
