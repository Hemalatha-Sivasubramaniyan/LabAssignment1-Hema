package lab04.problem1;

/**
 * @author Hemalatha S Date 30/10/2020 Bank Account operation with Withdraw and
 *         deposit method
 *
 */
public class Account {
	private long accNo;
	private double balance;
	private Person accHolder;

	/*
	 * Parameterized constructor
	 */
	public Account(long accNo, double balance, Person accHolder) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	/*
	 * getters and setters for the account element
	 */
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	/*
	 * method to perform deposit process
	 */
	public void deposite(double d) {
		balance += d;

	}

	/*
	 * method to perform withdrawal process
	 */
	public void withdraw(double d) {
		balance -= d;

	}

}
