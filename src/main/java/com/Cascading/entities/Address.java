package com.Cascading.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	private int aredId ;
	private String areaName ;
	
	@ManyToOne
	private StudentDetail studentDetail ;

	public int getAredId() {
		return aredId;
	}

	public void setAredId(int aredId) {
		this.aredId = aredId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}
	
	
	
	
}
