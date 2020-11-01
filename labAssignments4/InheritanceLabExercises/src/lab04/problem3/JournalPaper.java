package lab04.problem3;

import java.util.Scanner;

public class JournalPaper extends WrittenItem {
	private int publishedYear;

	/*
	 * Getter and setter for publishedYear
	 */
	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	/*
	 * Overriding addDetails method and setting the value for publishedYear
	 */
	@Override
	public void addDetails() {
		super.addDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year of Publication");
		setPublishedYear(sc.nextInt());
		//sc.close();
	}

	/*
	 * Overriding printDetails method and display the value for publishedYear
	 */
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Year of Publication " + getPublishedYear());
	}

}
