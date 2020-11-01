package lab04.problem1;

public class CurrentAccount extends Account {
	private double overDraftLim = 10000;

	/*
	 * Parameterized constructor for Current account
	 */
	public CurrentAccount(long accNo, double balance, Person accHolder) {
		super(accNo, balance, accHolder);
	}

	/*
	 * withdraw method is overridden here to perform the withdrawal by overDraft
	 * limit
	 */
	public void withdraw(double amt) {
		double bal, tempBal;
		bal = getBalance();
		/*
		 * Calculating balance with overdraft limit
		 */
		if (amt <= overDraftLim) {
			tempBal = bal - amt + overDraftLim;
			setBalance(tempBal); // Setting balance after calculating and comparing
			System.out.println("Balance after withdrawal " + tempBal);
		} else {
			System.out.println("Sorry! Could not process your withdrawal request");
		}
	}

}
