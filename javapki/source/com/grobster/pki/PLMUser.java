package com.grobster.pki;

import java.io.*;

public class PLMUser extends User implements Serializable{
	private static final long serialVersionUID = 623965572521L;
	private String firstName;
	private String lastName;
	private String gid;
	private String lte;
	private String admin;
	private String companyName;
	private String phoneNumber;
	private String hireDate;
	private Address address;
	
	public PLMUser(String firstName, String lastName, String gid, String lte, String admin, String companyName, String phoneNumber, String hireDate, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gid = gid;
		this.lte = lte;
		this.admin = admin;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.address = address;
		setLogonAccess(0);
	}
	
	
	//setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setGid(String gid) {
		this.gid = gid;
	}
	
	public void setLte(String lte) {
		this.lte = lte;
	}
	
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getGid() {
		return gid;
	}
	
	public String getLte() {
		return lte;
	}
	
	public String getAdmin() {
		return admin;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	public Address getAddress() {
		return address;
	}
}