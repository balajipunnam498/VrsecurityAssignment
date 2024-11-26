package com.org.vrsecurityservice;

import java.util.ArrayList;

import java.util.regex.Pattern;

import com.org.vrsecurityModel.vrsecurityModel;

public class VrsecurityService {
	vrsecurityModel object;
	
	public ArrayList<vrsecurityModel> LoginSheet = new ArrayList<>();
	
	public String Register(String emailid, String password, String firstname, String lastname, String gender, String mobilenumber) {
		object = new vrsecurityModel(emailid, password, firstname, lastname, gender, mobilenumber);
		LoginSheet.add(object);
		return "Registered Successful";
	}
	public String Login(String emailid, String password) {
		for(vrsecurityModel e : LoginSheet) {
			if(e.Emailgetter().equals(emailid) && e.Passwordgetter().equals(password)) {
				return "Login Successful";
			}
			else if(e.Emailgetter().equals(emailid) && (!e.Passwordgetter().equals(password))) {
				return "Password Incorrect";
			}
	}
		return "Details Not found Register First";
	
}
	 public boolean isEmail(String email) {
	        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	        
	        return Pattern.matches(emailRegex, email);
	    }
	 public boolean isPhonenumber(String Number) {
		 if(Number.charAt(0)>5 && Number.length()==10) {
			 return true;
		 }
		 return false;
	 }
	
}

