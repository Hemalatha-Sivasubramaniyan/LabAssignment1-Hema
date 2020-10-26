/**
 Author : Hemalatha
 Date : 24/10/20
 Desc : Replacing the Constants in a string with the next alphabet


*/
import java.util.*;

public class ReplaceConstants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next().toUpperCase();    //Converting String in uppercase
		System.out.println("String before replacement "+str);     //String before Replacement
		System.out.println("String after replacement "+alterString(str)); //String After Replacement
        
	}

	private static String alterString(String str) {
		char[] charArr = str.toCharArray();     //conversion of string to character array
		int length = charArr.length;
		int j=0;
		char[] temp = new char[length]; 
		
		// logic for checking consonants and replacement
		for(int i=0;i<charArr.length;i++) {
			if(charArr[i]=='A' || charArr[i]=='E' || charArr[i]=='I' || charArr[i]=='O' || charArr[i]=='U' ) {
				temp[j++]=charArr[i];
			}
			else {
				temp[j++]=(char)(charArr[i]+1);
			}
		}
		String str1 = new String(temp);  //Conversion of character array to string
		
		return str1;
	}

}
