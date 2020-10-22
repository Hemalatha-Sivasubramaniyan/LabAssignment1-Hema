/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Sum of Numbers divisible by 3 and 5 for N natural numbers


*/

import java.util.*;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int result = calculateSum(number);
		System.out.println("The Sum is "+result);
		
	}

	private static int calculateSum(int number) {

		int sum=0,index;
		for(index = 1; index <= number; index++) {
			if(index%3 == 0 && index%5==0) {
				sum+=index;
			}
		}
		return sum;
	}

}
