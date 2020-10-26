/**
 Author : Hemalatha
 Date : 25/10/20
 Desc : Checking whether a string is Positive


*/
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		if(isPositive(str)) {   //method calling
			System.out.println(str+" is a Positive string");
		}
		else{
			System.out.println(str+" is not a Positive string");
		}

	}

	private static boolean isPositive(String str) {
		int count=0;
		char[] charArr = str.toCharArray();   //string to character array
		for(int i=0;i<charArr.length;i++) {
			for(int j=i+1;j<charArr.length;j++) {
				if(charArr[i]<charArr[j])      //Comparing the characters
					count++;
				else
					return false;  //if character is not in alphabetical order returns false
			}
		}
		if(count>0)
		return true;
		else
			return false;
		
	}

}
