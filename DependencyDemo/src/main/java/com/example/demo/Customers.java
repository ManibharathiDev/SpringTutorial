package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int age;
	private String name;
	@Autowired
	private Technology techDetail;
	
	
	
	public Technology getTechDetail() {
		return techDetail;
	}
	public void setTechDetail(Technology techDetail) {
		this.techDetail = techDetail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Displaying Name");
		techDetail.displayTechName();
	}
	
}
