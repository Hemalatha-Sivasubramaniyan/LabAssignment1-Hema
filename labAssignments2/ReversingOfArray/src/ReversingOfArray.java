/**
 Author : Hemalatha
 Date : 23/10/20
 Desc : Removing duplicates and print the elements of an integer array in reverse order.


*/

import java.util.*;


public class ReversingOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int ind=0;ind<size;ind++) {
			arr[ind] = sc.nextInt();
		}
		Arrays.sort(arr);
		size = modifyArray(arr, size);
		
		// logic for descebding order
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int ind=0;ind<size;ind++) {
			System.out.print(arr[ind]+" ");
		}
	}

	private static int modifyArray(int[] arr, int size) {

		int temp[] = new int[size];
		int i=0;
		for(int ind=0;ind<size-1;ind++) {
			if(arr[ind] != arr[ind+1]) {   //checking for duplicate elements
				temp[i++]=arr[ind];        // storing the unique elements in temporary array
			}
		}
		temp[i++]=arr[size-1];
		
		for(int ind=0;ind<i;ind++) {
			arr[ind] = temp[ind];        //copying the temporary array in original array
		}
		return i;
	}

}
