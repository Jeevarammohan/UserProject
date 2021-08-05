package com.userproject.service;

import com.userproject.exception.NameExistsException;
import com.userproject.exception.TooLongException;
import com.userproject.exception.TooShortException;

public class Validation {
	String userNames[]= {"ram","priya","anu"};
	public boolean validateUserName(String userName)throws NameExistsException {
		for(String user:userNames) {
			if(user.equals(userName)) {
				throw new NameExistsException("Name already exist");
			}
		}
		return true;
	}
	
	public boolean validatePassword(String password) throws TooShortException,TooLongException {
		if(password.length()<4) {
			throw new TooShortException("Password is too short");
		}
		if(password.length()>10) {
			throw new TooLongException("Password is too long");
		}
		return true;
		
	}
}
