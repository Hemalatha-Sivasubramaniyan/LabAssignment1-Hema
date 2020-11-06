/**
 * @author Hemalatha S
 * Assigning medals to students based on their marks in the exam and printing 
 * the medal with the student id
 */
package lab6.problem7;

import java.util.HashMap;

public class MedalsBasedOnMarks {

	public static void main(String[] args) {
		/*
		 * Creating hashMap and putting the values in the map id-marks pair.
		 */
		HashMap<Integer, Integer> studentDetails = new HashMap<>();
		studentDetails.put(1, 85);
		studentDetails.put(2, 75);
		studentDetails.put(3, 97);
		studentDetails.put(4, 91);
		/*
		 * Creating hashMap for calling getStudents method to print the medal got by the
		 * students.
		 */
		HashMap<Integer, String> medalDetails = new HashMap<>();
		medalDetails = getStudents(studentDetails);
		for (HashMap.Entry<Integer, String> entry : medalDetails.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentDetails) {
		HashMap<Integer, String> medalMap = new HashMap<Integer, String>();
		/*
		 * Storing the medal got by students in map by marks scored. if marks is above
		 * 90 then it is Gold, if mark is between 80 to 89 then Silver then if mark is
		 * between 70 to 79 then Bronze
		 */
		for (HashMap.Entry<Integer, Integer> entry : studentDetails.entrySet()) {
			int marks = entry.getValue();
			int id = entry.getKey();
			String medal = null;
			if (marks >= 90) {
				medal = "Gold";
			} else if (marks >= 80 && marks <= 89) {
				medal = "Silver";
			} else if (marks >= 70 && marks <= 79) {
				medal = "Bronze";
			}
			medalMap.put(id, medal);

		}
		/*
		 * returning the map as id-medal pair.
		 */
		return medalMap;
	}

}
