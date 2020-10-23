/**
 Author : Hemalatha
 Date : 23/10/20
 Desc : Sorting string in alphabetical order and changing string to uppercase and lowercase


*/

import java.util.*;
public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		String stringArr[] = new String[size];
		System.out.println("Enter the Strings");
		for(int ind=0;ind<size;ind++) {
			stringArr[ind] = sc.next().toUpperCase(); //storing the input string in uppercase
		}
		
		String sortedArr[] = sortStrings(stringArr);
		for(int ind=0;ind<size;ind++) {
			System.out.println(sortedArr[ind]);
		}
	}

	private static String[] sortStrings(String[] stringArr) {

		Arrays.sort(stringArr);
		int length=stringArr.length;
		
		//logic for even number of Elements
		
		if(length%2==0) {
			for(int i=0, j=length/2; i<length/2 ; i++, j++) {
				stringArr[i]=stringArr[i].toUpperCase();
				stringArr[j]=stringArr[j].toLowerCase();
			}
		}
		// logic for odd number of elements
		
		else {
			for(int i=0; i<length/2+1; i++) {
				stringArr[i]=stringArr[i].toUpperCase();
			}
			for(int j=length/2+1; j<length ;j++) {
				stringArr[j]=stringArr[j].toLowerCase();
			}
		}
		return stringArr;
	}

}
