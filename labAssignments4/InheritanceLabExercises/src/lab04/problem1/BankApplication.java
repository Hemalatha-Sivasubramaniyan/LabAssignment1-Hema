package lab04.problem1;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		/*
		 * Declaring objects for Person class with values
		 */
		Person p1 = new Person("Smith", 45);
		Person p2 = new Person("Kethy", 32);
		/*
		 * Declaring objects for Account class with values
		 */
		Account acc1 = new Account(12345, 2000, p1);
		Account acc2 = new Account(12356, 3000, p2);
		/*
		 * Method calling for deposit and withdraw
		 */
		acc1.deposite(2000d);
		acc2.withdraw(2000d);
		/*
		 * displaying the balance after deposit and withdraw process
		 */
		System.out.println("Smith's balance " + acc1.getBalance());
		System.out.println("Kethy's balance " + acc2.getBalance());
		/*
		 * Getting input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw in Smith's account");
		double withdrawAmtSmith = sc.nextDouble();
		/*
		 * Creating SavingsAccount Object and calling withdraw method by it
		 */
		SavingsAccount sa = new SavingsAccount(12345, acc1.getBalance(), p1);
		sa.withdraw(withdrawAmtSmith);

		System.out.println("Enter the amount to be withdraw in Kathy's account");
		double withdrawAmtKathy = sc.nextDouble();
		sc.close();
		/*
		 * Creating CurrentAccount Object and calling withdraw method by it
		 */
		CurrentAccount ca = new CurrentAccount(12345, acc2.getBalance(), p2);
		ca.withdraw(withdrawAmtKathy);

	}

}
