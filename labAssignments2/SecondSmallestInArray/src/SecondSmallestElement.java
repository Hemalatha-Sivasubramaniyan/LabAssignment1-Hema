/**
 Author : Hemalatha
 Date : 23/10/20
 Desc : Printing the second smallest Element in an array


*/

import java.util.*;


public class SecondSmallestElement {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements");
		for(int index = 0; index <size; index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println("The second smallest element is "+getSecondSmallest(arr)); //method callig
		
		
	}

	private static int getSecondSmallest(int[] arr) {

		Arrays.sort(arr);   //sorting of an array in ascending order
		return arr[1];      // returning the second smallest value 
	}

}
