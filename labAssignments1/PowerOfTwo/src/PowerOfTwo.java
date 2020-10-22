/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Checking given number is power of two


*/

import java.util.*;

public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if(checkNumber(number)) {
			System.out.println("The "+number+" is power of 2");
		}
		else{
			System.out.println("The "+number+" is not power of 2");
		}
	}

	private static boolean checkNumber(int number) {

		if(number == 0)
			return false;
		while(number != 1) {
			if(number%2 != 0) {
				return false;
			}
			number /=2;
		}
		return true;
	}

}
