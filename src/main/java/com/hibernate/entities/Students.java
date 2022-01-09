package com.hibernate.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	
	@Id
	private int id ;
	private String stuName ;
	private String stuCity ;
	private String phone ;
	
	public Students(int id, String stuName, String stuCity, String phone) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.phone = phone;
	}

	public Students() {
	
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuCity() {
		return stuCity;
	}

	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", stuName=" + stuName + ", stuCity=" + stuCity + ", phone=" + phone + "]";
	}
	
	
	
	

}
