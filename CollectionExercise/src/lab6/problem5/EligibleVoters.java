/**
 * @author Hemalatha S
 * Checking age of person by getting their date of birth and making a list of voters 
 * if their age is greater than 18.
 */
package lab6.problem5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EligibleVoters {

	public static void main(String[] args) {
		/*
		 * Creating hashMap for voterDetails and store the value in it.
		 */
		HashMap<Integer, String> voterDetails = new HashMap<>();
		voterDetails.put(1, "23/04/1999");
		voterDetails.put(2, "05/11/1989");
		voterDetails.put(3, "21/08/2003");
		voterDetails.put(4, "25/07/2000");
		/*
		 * Printing the Id of voters
		 */
		List<Integer> voterList = getVoterList(voterDetails);
		for (Integer list : voterList) {
			System.out.print(list + " ");
		}

	}

	private static List<Integer> getVoterList(HashMap<Integer, String> voterDetails) {
		/*
		 * Creating arrayList for storing the id whose age is above 18.
		 */
		ArrayList<Integer> eligibilityList = new ArrayList<>();
		/*
		 * Using entrySet iterating through the map
		 */
		for (HashMap.Entry<Integer, String> entry : voterDetails.entrySet()) {
			String dob = entry.getValue();
			Integer id = entry.getKey();
			/*
			 * Getting PresentDate
			 */
			LocalDate presentDate = LocalDate.now();
			/*
			 * formatting the date as dd/mm/yyyy
			 */
			LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/mm/yyyy"));
			/*
			 * Calculating the period between the dateOfBirth and presentDate
			 */
			Period age = Period.between(dateOfBirth, presentDate);
			/*
			 * if age is greater than 18 id is stored in the list
			 */
			if (age.getYears() > 18) {

				eligibilityList.add(id);
			}

		}
		/*
		 * returning the list
		 */

		return eligibilityList;
	}

}
