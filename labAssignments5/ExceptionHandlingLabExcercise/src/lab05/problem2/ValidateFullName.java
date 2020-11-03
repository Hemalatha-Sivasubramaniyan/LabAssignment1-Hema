/**
 * author Hemalatha S
 * Creating exception if the user does not enter the first and second name.
 */
package lab05.problem2;

import java.util.Scanner;
/*
 * User defined exception class which extends Exception
 */

class BlankName extends Exception {

	public BlankName(String str) {
		super(str);
	}

}

public class ValidateFullName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Getting input from user and Checking whether first name and second name is
		 * entered. If not exception is thrown.
		 */
		try {
			System.out.println("Enter the first name");
			String fName = sc.nextLine();
			if (fName.isEmpty()) {
				throw new BlankName("Fill the FirstName");
			}
			System.out.println("Enter the second name");
			String sName = sc.nextLine();
			sc.close();
			if (sName.isEmpty()) {
				throw new BlankName("Fill the SecondName");
			}
			System.out.println("Your Name is: " + fName + " " + sName);
		}
		/*
		 * Printing the user define exception.
		 */
		catch (BlankName n) {
			System.out.println(n.getMessage());
		}
		// sc.close();

	}

}
