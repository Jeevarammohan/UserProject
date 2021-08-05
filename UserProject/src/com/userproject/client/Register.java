package com.userproject.client;

import java.util.Scanner;

import com.userproject.exception.NameExistsException;
import com.userproject.exception.TooLongException;
import com.userproject.exception.TooShortException;
import com.userproject.service.Validation;

public class Register {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validation validate = new Validation();
		System.out.println("Enter userName to register:");
		String userName = scanner.next();
		try {
			if (validate.validateUserName(userName)) {
				System.out.println("Enter the password:");
				String password = scanner.next();
				try {
					if (validate.validatePassword(password)) {
						System.out.println("Welcome User");
					}
				} catch (TooShortException | TooLongException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (NameExistsException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();

	}

}
