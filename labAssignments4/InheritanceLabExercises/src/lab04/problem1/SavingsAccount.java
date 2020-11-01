package lab04.problem1;

public class SavingsAccount extends Account {

	final private double minBalance = 500;

	public SavingsAccount(long accNo, double balance, Person accHolder) {
		super(accNo, balance, accHolder);
	}

	/*
	 * withdraw method is overridden here to perform the withdrawal by minimum
	 * balance
	 */

	public void withdraw(double amt) {
		double tempBal;
		/*
		 * Calculating balance by subtracting minimum balance from account balance
		 */
		tempBal = getBalance() - amt;
		/*
		 * Checking balance is greater than minimum balance and printing the output
		 * accordingly
		 */
		if (tempBal >= minBalance) {
			setBalance(tempBal);
			System.out.println("Balance after withdrawal " + tempBal);
		} else {
			System.out.println("Sorry! Could not process your withdrawel request");
		}
	}

}
