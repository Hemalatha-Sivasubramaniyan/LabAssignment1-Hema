/**
 * @author Hemalatha S
 * Creating method to get values in hashmap then covert it into sorted list
 */
package lab6.problem1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortedList {

	public static void main(String[] args) {
		/*
		 * creating hashMap<Integer,Integer> and store values in it
		 */
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 40);
		map.put(3, 30);
		map.put(4, 70);
		map.put(8, 50);
		/*
		 * Object creation for call the getValue method
		 */
		SortedList sl = new SortedList();
		List<Integer> list = sl.getValue(map);
		/*
		 * Printing the sorted list
		 */
		for (Integer l : list) {
			System.out.println(l);
		}

	}

	/*
	 * Method to perform map to list conversion
	 */
	private List<Integer> getValue(Map<Integer, Integer> map) {
		/*
		 * getting value from the map, store it and assign the values in list
		 */
		Collection<Integer> value = map.values();
		List<Integer> arrList = new ArrayList<>(value);
		/*
		 * Sorting the list and return it
		 */
		Collections.sort(arrList);
		return arrList;
	}

}
