package com.Embadded.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int stuId ;
	private String stuName ;
	private String stuCity ;
	
	private Certificate cert ;

	public Student() {
	
	}

	public Student(int stuId, String stuName, String stuCity, Certificate cert) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.cert = cert;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
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

	public Certificate getCert() {
		return cert;
	}

	public void setCert(Certificate cert) {
		this.cert = cert;
	}
	
	
	
}
