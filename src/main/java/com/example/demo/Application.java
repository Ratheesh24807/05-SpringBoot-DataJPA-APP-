package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		// inserting the records into database
		
	//	Student s1 = new Student(102,"Kiran","Male","EPCET");
	//	Student s2 = new Student(103,"Ramya","Female","CMRIT");
	//	Student s3 = new Student(104,"Shashi","Male","Cambridge");
	//	Student s4 = new Student(105,"Amrutha","Female","Cambridge");
		
	//	List<Student> students = Arrays.asList(s1,s2,s3,s4);
	//	repo.saveAll(students);
		
	//	System.out.println("Records are inserted");
		
		// findbyXXX method
		
		List<Student> MaleStudents = repo.findByGender("Male");
		
		MaleStudents.forEach(System.out::println);
		
		List<Student> Female= repo.findByGenderAndSchool("Female","Cambridge");
		
		Female.forEach(System.out::println);
	}

}
