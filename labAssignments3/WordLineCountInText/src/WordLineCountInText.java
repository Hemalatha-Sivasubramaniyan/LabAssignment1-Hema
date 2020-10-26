/**
 Author : Hemalatha
 Date : 24/10/20
 Desc : Printing the number of character, lines and words in a text.


*/
import java.util.*;
public class WordLineCountInText {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfChar=0, noOfWords=0;
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String[] newStr = str.split(" ");  //Splitting the string using space to count the words
		noOfWords = newStr.length;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {    //counting the characters
				noOfChar++;
			}
		}
		System.out.println("Number of characters in the text are "+noOfChar+" and words are "+noOfWords);
	}

}
