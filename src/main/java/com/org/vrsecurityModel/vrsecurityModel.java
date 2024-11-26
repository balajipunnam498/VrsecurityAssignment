package com.org.vrsecurityModel;

public class vrsecurityModel {
	//creating variables
	private String Emailid;
	private String Password;
	private String Firstname;
	private String LastName;
	private String Gender;
	private String MobileNumber;
	//creating constructor argument to intialize values.
	public vrsecurityModel(String mailid, String password, String FirstName, String LastName, String Gender, String mobilenumber){
		this.Emailid=mailid;
		this.Password=password;
		this.Firstname=FirstName;
		this.LastName=LastName;
		this.Gender=Gender;
		this.MobileNumber=mobilenumber;
	}
	//creating Getters and Setters
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
 public String Emailgetter() {
	 return Emailid;
 }
 public void EmailSetter(String Email) {
	 this.Emailid=Email;
 }
public String Passwordgetter() {
	return Password;
}
public void passwordSetter(String password) {
	this.Password=password;
}
}
