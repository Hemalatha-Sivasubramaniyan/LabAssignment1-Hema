/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Checking if an number is increasing number


*/
import java.util.*;

public class IncreasingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		if(checkNumber(number)) {
			System.out.println("The given number is an Increasing Number");
		}
		else {
			System.out.println("The number is not an Increasing Number");
		}
	}

	private static boolean checkNumber(int number) {

		int digit1, digit2, temp,count=0;
		while(number != 0) {
			digit1 = number%10;
			temp = number;
			temp /=10;
			digit2 = temp%10;
			if(digit1 >= digit2) {
				count++;
			}
//			else {
//				return false;
//			}
			number /=10;
		}
		if(count>0)
			return true;
		else
		return false;
	}

}
