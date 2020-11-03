/**
 * author Hemalatha S
 * Creating EmployeeException if the salary is less than 3000
 */
package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Getting salary detail from user
		 */
		System.out.println("Enter your Salary");
		double salary = sc.nextDouble();
		sc.close();
		/*
		 * Checking if salary is less than 3000, then define a user define exception
		 */
		try {
			if (salary < 3000.0) {
				throw new EmployeeException("Salary should be above 3000");
			} else {
				System.out.println("Your salary is " + salary);
			}
		}
		/*
		 * Printing EmployeeException in the catch block
		 */
		catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
