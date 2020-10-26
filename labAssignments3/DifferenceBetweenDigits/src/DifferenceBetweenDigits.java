/**
 Author : Hemalatha
 Date : 25/10/20
 Desc : Making a number by finding the difference between the number


*/
import java.util.*;
public class DifferenceBetweenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		String str = String.valueOf(number); //Integer to String
		int modifiedNo = modifyNumber(str);   //method calling
		System.out.println("The number made of diffenece between digit is "+modifiedNo);

	}

	private static Integer modifyNumber(String str) {
		
		int num1=0,num2,diff,diffNo;
		int len=str.length();
		StringBuffer sb= new StringBuffer(); //StringBuffer for appending
		for(int i=0;i<str.length()-1;i++) {
			// conversion of string to integer using charAt()
			num1=Integer.parseInt((String.valueOf((str.charAt(i))))); 
			num2=Integer.parseInt((String.valueOf((str.charAt(i+1)))));
			diff = Math.abs(num1-num2);    //calculating difference
			sb.append(diff);		 // integer appending	
		}
		sb.append(str.charAt(len-1));
		String str1 = sb.toString(); //stringBuffer to string
		diffNo=Integer.parseInt(str1); //string to integer
		return diffNo ;
	}

}
