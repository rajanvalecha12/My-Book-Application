package com.training;

public class Person {

private String name;
private String sirName;
private String emailId;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSirName() {
	return sirName;
}
public void setSirName(String sirName) {
	this.sirName = sirName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Person( String name, String sirName, String emailId) {
	super();
	
	this.name = name;
	this.sirName = sirName;
	this.emailId = emailId;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [ name=" + name + ", sirName=" + sirName + ", emailId=" + emailId + "]";
}

}
