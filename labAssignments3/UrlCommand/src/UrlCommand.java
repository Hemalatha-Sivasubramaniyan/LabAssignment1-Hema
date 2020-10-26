/**
 Author : Hemalatha
 Date : 24/10/20
 Desc : Printing the command from given url.


*/

import java.util.*;

public class UrlCommand {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Url");
		String url = sc.nextLine();
		System.out.println("The Command in the Url is "+getCommand(url)); //calling the method
	}


	private static String getCommand(String url) {
		
		//splitting the string using '/' and storing it in string array
		String[] str1 = url.split("[/]");     
		int length=str1.length;
		String temp= str1[length-1];     //storing the last string in a temporary string
		String str2[]=temp.split("[.]");
		String command =(str2[0]);;
	    return command;    //returning the command
	}

}
