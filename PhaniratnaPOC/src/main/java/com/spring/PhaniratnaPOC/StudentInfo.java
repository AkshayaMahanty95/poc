package com.spring.PhaniratnaPOC;

public class StudentInfo {

	private String name;
	private int classNo;
	private String address;
	private String emailId;
	private int phoneNo;
	//default constructor
	public StudentInfo() {
		super();
	}
	//param constructor
	public StudentInfo(String name, int classNo, String address, String emailId, int phoneNo) {
		super();
		this.name = name;
		this.classNo = classNo;
		this.address = address;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	//tostring
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", classNo=" + classNo + ", address=" + address + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + "]";
	}
}
