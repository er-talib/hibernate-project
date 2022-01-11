package com.Cascading.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentDetail {
	
	@Id
	private int stuId ;
	private String stuName ;
	
	@OneToMany(mappedBy = "studentDetail", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Address> addreses ;

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

	public List<Address> getAddreses() {
		return addreses;
	}

	public void setAddreses(List<Address> addreses) {
		this.addreses = addreses;
	}
	
	

}
