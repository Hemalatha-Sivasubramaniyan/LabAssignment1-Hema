/**
 * @author Hemalatha S
 * Creating user defined exception if a person age is less than 15
 */
package lab05.problem1;

import java.util.Scanner;

public class AgeOfPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * getting age as a input from user
		 */
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		sc.close();
		try {
			if (age < 15) {
				/*
				 * Creating user defined exception if condition fails if age is less than 15
				 * then exception occurs.
				 */
				throw new ageLimitException("Age sholud be above 15");
			} else {
				System.out.println("Your age is " + age);
			}
		}
		/*
		 * Catching the user define exception and printing it
		 */
		catch (ageLimitException a) {
			System.out.println(a.getMessage());
		}

	}

}
