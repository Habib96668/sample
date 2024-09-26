package com.example.project4.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	String name;
	
	@Id
	String email;
	
	int age;
	
	long phonenumber;
	
	String qualification;
	
	double ctc;
	
	@Embedded
	Address address;
	
	public Student() {
		
	}
	
	public Student(String name, String email, int age, long phonenumber, String qualification, double ctc, Address address) {
//		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phonenumber = phonenumber;
		this.qualification = qualification;
		this.ctc = ctc;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getCtc() {
		return ctc;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
