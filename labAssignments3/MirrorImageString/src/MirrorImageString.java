/**
 Author : Hemalatha
 Date : 24/10/20
 Desc : Printing a mirror image for a given string


*/
import java.util.*;
public class MirrorImageString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(str+"|"+getImage(str)); // method calling

	}

	private static StringBuffer getImage(String str) {
		StringBuffer sb = new StringBuffer(str);   //using string buffer to reverse the string
		sb.reverse();
		return sb; //returning the reversed string
	}

}
