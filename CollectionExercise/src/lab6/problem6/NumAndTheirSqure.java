package lab6.problem6;

/**
 * @author Hemalatha S
 * Creating solution for accepting an array of integers and covert it into 
 * a list then calculating the square values then store it in a map
 *  
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NumAndTheirSqure {

	public static void main(String[] args) {
		/*
		 * Creating an array of integers and converting it into list
		 */
		Integer[] arr = { 5, 15, 36, 92, 77, 69 };
		List<Integer> list = Arrays.asList(arr);
		/*
		 * Creating a hashMap to store the value returned from the getSqure method
		 */
		HashMap<Integer, Integer> numAndSqure = new HashMap<>();
		numAndSqure = getSqure(list);
		/*
		 * Printing the hashMap using entrySet to print as Key_Value pair
		 */
		for (HashMap.Entry<Integer, Integer> entry : numAndSqure.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static HashMap<Integer, Integer> getSqure(List<Integer> list) {
		/*
		 * Creating hashMap to store the square value and the number
		 */
		HashMap<Integer, Integer> mapWithSqure = new HashMap<>();
		for (Integer listOps : list) {
			int squre = (listOps * listOps);
			mapWithSqure.put(listOps, squre);
		}
		/*
		 * returning the map
		 */
		return mapWithSqure;
	}

}
