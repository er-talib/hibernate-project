package com.hibernate.entities;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="stu_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int streetNo;
	@Column(name="street_Name" , length = 100)
	private String streetName;
	@Column(length=100)
	private String landMark;
	
	private boolean isOpen;
	@Transient
	private double nothing;
	@Temporal(TemporalType.DATE)
	private Date dataSaveDate;
	@Lob
	private byte[] image;
	
	public Address(int streetNo, String streetName, String landMark, boolean isOpen, double nothing, Date dataSaveDate,
			byte[] image) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
		this.landMark = landMark;
		this.isOpen = isOpen;
		this.nothing = nothing;
		this.dataSaveDate = dataSaveDate;
		this.image = image;
	}

	public Address() {
	
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getNothing() {
		return nothing;
	}

	public void setNothing(double nothing) {
		this.nothing = nothing;
	}

	public Date getDataSaveDate() {
		return dataSaveDate;
	}

	public void setDataSaveDate(Date dataSaveDate) {
		this.dataSaveDate = dataSaveDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", streetName=" + streetName + ", landMark=" + landMark + ", isOpen="
				+ isOpen + ", nothing=" + nothing + ", dataSaveDate=" + dataSaveDate + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	

	
}
