package lab04.problem3;

import java.util.Scanner;

public class Video extends MediaItem {
	/*
	 * Attributes of video
	 */
	private String director;
	private String genre;
	private int year;

	/*
	 * Getters and Setters for the private attributes
	 */
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/*
	 * Overriding the method to add details
	 */
	@Override
	public void addDetails() {
		super.addDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Director");
		setDirector(sc.nextLine());
		System.out.println("Enter the Genre");
		setGenre(sc.next());
		System.out.println("Enter the Year");
		setYear(sc.nextInt());
		//sc.close();
	}

	/*
	 * Overriding method to display details
	 */
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Director: " + getDirector());
		System.out.println("Genre: " + getGenre());
		System.out.println("Year: " + getYear());
	}

}
