/**
 * Creating an Employee service for getting user details and find the Insurance Scheme
 * @author Hemalatha S
 */
package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * Creating object for Employee and EmployeeService class
		 */
		Employee emp = new Employee();
		EmployeeService serv = new Service();
		Scanner sc = new Scanner(System.in);
		int n = 1;
		/*
		 * Menu for operations to perform
		 */
		while (n > 0) {
			System.out.println("1)Give User Information");
			System.out.println("2)Get Insurance Scheme & Display the Details");
			System.out.println("3)Exit");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			/*
			 * Invoking methods according to the choice
			 */
			switch (choice) {

			case 1:
				serv.getEmployeeDetails(emp);
				break;
			case 2:
				serv.displayDetails(emp);
				break;
			case 3:
				System.out.println("Thanks for using Employee Service");
				n = 0;
				break;
			default:
				System.out.println("Choose from 1,2,3!");
			}
		}
		sc.close();

	}

}
