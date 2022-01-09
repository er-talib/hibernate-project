package com.Embadded.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String courst ;
	private String duration ;

	public Certificate(String courst, String duration) {
		super();
		this.courst = courst;
		this.duration = duration;
	}

	public Certificate() {
		
	}

	public String getCourst() {
		return courst;
	}

	public void setCourst(String courst) {
		this.courst = courst;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	

}
