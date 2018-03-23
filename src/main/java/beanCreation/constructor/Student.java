package beanCreation.constructor;

import java.util.Date;

public class Student {
	
	private Integer id;
	private String name;
	private char gender;
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public Student(Integer id, String name, Date birthdate, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
