/**
 Author : Hemalatha
 Date : 23/10/20
 Desc : Reverse the number in the array


*/

import java.util.*;
public class ReverseTheNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int ind=0;ind<size;ind++) {
			arr[ind] = sc.nextInt();
		}
		int sortedArr[] = getSorted(arr);
		for(int ind=0;ind<size;ind++) {
		System.out.print(sortedArr[ind]+" ");   //printing the sorted array
		}
	}

	private static int[] getSorted(int[] arr) {

		for(int ind=0;ind<arr.length;ind++) {
		int reverse=0;
		   while(arr[ind]>0) {            //reversing the number
			   int temp= arr[ind]%10;
			   reverse = reverse*10+temp;
		       arr[ind]/=10;
		   }
		   arr[ind]=reverse;         //storing reversed element in the array
		   
		}
		Arrays.sort(arr);        // array sorting
		return arr;
	}
		
}
	

//	private static int getSorted(int[] arr, int size) {
//
//		String temp[] = new String[size];
//		for(int ind=0;ind<size;ind++) {
//			temp[ind]=arr.toString();
//		}
////		for(int ind=0;ind<size;ind++) {
////			//StringBuilder sb = new StringBuilder(temp[ind]);
////			//temp[ind]=sb.reverse();
////			//temp[ind]=StringFormatter.reveseString(temp[ind]);
////		}
//		return 0;
	//}

//}
