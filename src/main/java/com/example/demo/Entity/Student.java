package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_dtls")
public class Student {

	@Id
	@Column(name = "Student_Id")
	private Integer id;
	private String name;
	private String gender;
	private String school;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setID(Integer id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", school=" + school + "]";
	}

	public Student(Integer id, String name, String gender, String school) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.school = school;
	}
	
	
}
