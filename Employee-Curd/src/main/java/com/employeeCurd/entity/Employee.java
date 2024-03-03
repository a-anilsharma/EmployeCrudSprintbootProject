package com.employeeCurd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fistname;
	private String lastname;
	private int age;
	private String Phoneno;
	private int salary;
	public Employee(Long id, String fistname, String lastname, int age, String phoneno, int salary) {
		super();
		this.id = id;
		this.fistname = fistname;
		this.lastname = lastname;
		this.age = age;
		Phoneno = phoneno;
		this.salary = salary;
	}
	public Employee() {
		super();

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFistname() {
		return fistname;
	}
	public void setFistname(String fistname) {
		this.fistname = fistname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fistname=" + fistname + ", lastname=" + lastname + ", age=" + age
				+ ", Phoneno=" + Phoneno + ", salary=" + salary + "]";
	}
	
	
	
}
