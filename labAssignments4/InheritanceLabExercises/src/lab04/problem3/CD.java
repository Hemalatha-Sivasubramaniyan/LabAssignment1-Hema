package lab04.problem3;

import java.util.Scanner;

public class CD extends MediaItem {
	/*
	 * Attributes of CD
	 */
	private String artist;
	private String genreCD;

	/*
	 * Getters and Setters for the private attributes
	 */
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenreCD() {
		return genreCD;
	}

	public void setGenreCD(String genreCD) {
		this.genreCD = genreCD;
	}

	/*
	 * Overriding the method to add details
	 */
	@Override
	public void addDetails() {
		super.addDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Artist");
		setArtist(sc.nextLine());
		System.out.println("Enter the Genre");
		setGenreCD(sc.next());
		//sc.close();
	}

	/*
	 * Overriding method to display details
	 */
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("Artist: " + getArtist());
		System.out.println("Genre: " + getGenreCD());
	}

}
