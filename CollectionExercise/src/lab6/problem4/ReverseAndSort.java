/**
 * @author Hemalatha S
 * Creating solution for accepting an array and reverse it then sorting it
 *  before returning the values using list
 */

package lab6.problem4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAndSort {

	public static void main(String[] args) {
		/*
		 * Creating an Integer array and passing it through getSorted method for perform
		 * the reversing and sorting using list
		 */
		Integer[] arr = { 5, 10, 86, 92, 17, 60 };
		List<Integer> list = getSorted(arr);
		/*
		 * Printing the Sorted array elements as list
		 */
		System.out.println("\n-------Sorted Array using list------");
		for (Integer l : list) {
			System.out.print(l + " ");
		}

	}

	private static List<Integer> getSorted(Integer[] arr) {
		/*
		 * Array to list conversion
		 */
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		/*
		 * Printing the Reversed array elements as list
		 */
		System.out.println("-------Reversed Array using list------");
		for (Integer l : list) {
			System.out.print(l + " ");
		}
		/*
		 * Sorting the list using collection sort method
		 */
		Collections.sort(list);
		return list;
	}

}
