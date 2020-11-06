/**
 * @author Hemalatha S
 * Finding second smallest element in an array using list
 */
package lab6.problem3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestByList {

	public static void main(String[] args) {
		/*
		 * Creating an Integer array and passing it through getSecondSmallest method to
		 * get value.
		 */
		Integer[] arr = { 5, 10, 4, 9, 7, 6 };
		int secondSmallest = getSecondSmallest(arr);
		System.out.println(secondSmallest);

	}
	/*
	 * Integer array is passed and converted as a list then by sorting the list using
	 * collection sort method.After that value is returned.
	 */

	private static int getSecondSmallest(Integer[] arr) {
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		int sSmallest = list.get(1);
		return sSmallest;
	}

}
