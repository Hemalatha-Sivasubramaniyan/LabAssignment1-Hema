package lab04.problem1;

public class Person {

	private String name;
	private float age;

	/*
	 * Parameterized constructor
	 */
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	/*
	 * getters and setters for Person class element
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
}
