/**
 Author : Hemalatha
 Date : 24/10/20
 Desc : Using stringTokenizer to calculate the sum of integer string.


*/
import java.util.*;
public class SumOfIntegerString {

	public static void main(String[] args) {
		int sum=0;
		
		//reading the string using stringTokenizer
        StringTokenizer intString = new StringTokenizer("10,39,59,21,71",",");
        while(intString.hasMoreTokens()) {
        	sum= sum+Integer.parseInt(intString.nextToken());  //string to integer conversion
        }
        System.out.println("The Sum Integer string is "+sum); //printing the sum of integer
	}

}
