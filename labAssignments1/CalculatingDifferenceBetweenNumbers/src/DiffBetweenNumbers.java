/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Calculating difference between sum of squres and squre of the sum


*/

import java.util.*;
import java.lang.*;

public class DiffBetweenNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int result = calculateDifference(number);
		System.out.println("The Difference is "+result);
	}

	private static int calculateDifference(int number) {

		int sumOfSqure=0, squreOfSum=0,temp_sum=0, index,temp,difference=0;
		for(index = 1; index <= number; index++) {
			temp=(index*index);
			sumOfSqure += temp;
		}
		
		for(index = 1; index <= number; index++) {
			temp_sum += index;
		}
		
		squreOfSum = (temp_sum*temp_sum);
		
		difference = Math.abs(sumOfSqure - squreOfSum );
		return difference;
	}

}
