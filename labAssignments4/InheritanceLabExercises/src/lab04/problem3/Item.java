/**
 * Creating a library System to add and print details
 * @author Hemalatha S
 */
package lab04.problem3;

public abstract class Item {
	/*
	 * Attributes of abstract class
	 */
	private long id;
	private String title;
	private int noOfCopies;

	/*
	 * Getters and setters for the class attributes
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	/*
	 * abstract methods to implement in child classes for add and print details
	 */
	public abstract void addDetails();

	public abstract void printDetails();

}
