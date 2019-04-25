package com.cognizant.registration;

public class Registration {
private String fname;
private String lname;
private String email;
private String userid;
private String emptype;

public Registration() {
	super();
}
public Registration(String fname, String lname, String email, String userid, String emptype) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.userid = userid;
	this.emptype = emptype;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getEmptype() {
	return emptype;
}
public void setEmptype(String emptype) {
	this.emptype = emptype;
}
}
