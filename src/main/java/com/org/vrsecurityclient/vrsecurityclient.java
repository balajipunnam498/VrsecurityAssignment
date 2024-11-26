package com.org.vrsecurityclient;

import java.util.Scanner;

import com.org.vrsecurityModel.vrsecurityModel;
import com.org.vrsecurityservice.VrsecurityService;

public class vrsecurityclient {
	public static void main(String[] args) {
		VrsecurityService object = new VrsecurityService();
		//Adding dummy builtin details of two users
		vrsecurityModel object1 = new vrsecurityModel("balajipunnam47@gmail.com", "Balaji77", "Balaji", "Punnam", "Male", "9381089417");
		vrsecurityModel object2 = new vrsecurityModel("virat7@gmail.com", "Balaji", "Virat", "Kohli", "Male", "9963944668");
		object.LoginSheet.add(object2);
		object.LoginSheet.add(object1);
		
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("1.Login Now" + "\n" + "2.Register Now" + "\n" + "Enter Your Choice: ");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter EmailID: ");
				String emailid = in.next();
				if (object.isEmail(emailid)) {
					System.out.print("Enter Password: ");
					String password = in.next();
					System.out.println(object.Login(emailid, password));
					System.out.println("Press 1 to Logout"+"\n"+"Press 2 to Exit");
					int option=in.nextInt();
					if(option==1) {
						System.out.println("Logout Successful");
						flag = false;
					}
					else if(option==0) {
						System.exit(0);
					}
					else {
						System.out.println("Invalid Choice");
					}
					
				} else {
					System.out.println("Not a valid email ID.");
				}
				
				break;

			case 2:
				System.out.println("Enter EmailID: ");
				String emailid1 = in.next();
				if (object.isEmail(emailid1)) {
					System.out.print("Enter Password: ");
					String password1 = in.next();
					System.out.print("Enter Confirm Password: ");
					String confirmpassword = in.next();
					System.out.print("Enter First Name: ");
					String firstname=in.next();
					System.out.print("Enter Last Name: ");
					String lastName=in.next();
					System.out.print("Enter gender: ");
					String gender=in.next();
					System.out.print("Enter Mobile Number: ");
					String number=in.next();
					if(object.isPhonenumber(number)) {
					if (password1.equals(confirmpassword)) {
						System.out.println(object.Register(emailid1, password1, firstname, lastName, gender, number));
					} else {
						System.out.println("Password Not matched Register again");
					}
				} else {
					System.out.println("Invalid Phone number");
				}
				}else {
					System.out.println("Not a valid email ID.");
				}
				break;
			default:
				System.err.println("Invalid Choice");
			}
		}
	}
}
