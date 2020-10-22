/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Cube of digits for a given number


*/

import java.util.*;
public class CubeOfDigitsSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number");
         int Num = sc.nextInt();
         int result = cubeSum(Num);
         System.out.println("The Cube Sum is "+result);
	}

	private static int cubeSum(int num) {
          int temp=num;
          int sum=0, lDigit, cube;
          while(temp!=0) {
        	  lDigit = temp%10;
        	  cube = (lDigit*lDigit*lDigit);
        	  sum += cube;
        	  temp /= 10;
          }
		return sum;
	}
	
	

}
