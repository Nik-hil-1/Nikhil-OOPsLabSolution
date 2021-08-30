package com.gl.itsupportadmin.service;

import java.util.*;
import com.gl.itsupportadmin.pojo.Employee;

public class Service {
	
    public String generatePassword() {
		
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"0123456789"+"!@#$%^&*()-=_+?/><";
		
		String password = "";
		Random random = new Random();
		char[] buildPassword = new char[8];
		
		for(int i = 0; i<8; i++) {
			buildPassword[i] = letters.charAt(random.nextInt(letters.length()));
			password += buildPassword[i];
		}
		
		return password;
	}
	
	public String generateEmail(Employee emp,  String department) {
		
		String fullName = emp.getFirstName()+emp.getLastName();
		String name = "";
		char[] lowerCase = new char[fullName.length()];
		
		for(int i=0; i<fullName.length(); i++) {
			lowerCase[i] = Character.toLowerCase(fullName.charAt(i));
			name += lowerCase[i];
		}
		
        return name+"."+department+"@greatlearning.com";
	}
	
	public void showCredentials(Employee emp, String department ) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --> "+generateEmail(emp, department));
		System.out.println("Password --> "+generatePassword());
	}
}
