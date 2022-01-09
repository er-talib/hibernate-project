package com.manytomany.mapping.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int eId ;
	private String eName ;
	
	@ManyToMany
	@JoinTable(name="emp_project" , joinColumns = {@JoinColumn(name="e_id")} , inverseJoinColumns = {@JoinColumn(name="p_id")} )
	private List<Project> project; 
	

	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	

}
