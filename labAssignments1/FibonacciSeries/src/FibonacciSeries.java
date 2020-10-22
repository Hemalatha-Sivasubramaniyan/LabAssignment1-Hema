/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Fibonacci Series with and without recursion



*/
import java.util.*;

public class FibonacciSeries {
	static int num1=0,num2=1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit= sc.nextInt();
		
		 int num1=0,num2=1,next,ind;
		 System.out.println("Fibonacci series without recursion");
		 for(ind = 1; ind <= limit ;ind++){
	      System.out.print(num1+" ");
		  next=num1+num2;
		  num1=num2;
		  num2=next;
		 }
		 System.out.println("\nFibonacci Series With Recursion");
		 num1=0 ; num2=1;
		 System.out.print(num1+" "+num2);
		 FibonacciInRecursive(limit-2);
		 
	}

	private static void FibonacciInRecursive(int limit) {

		int num3;
		if(limit>0) {
			num3= num1+num2;
			num1= num2;
			num2=num3;
			System.out.print(" "+num3);
			FibonacciInRecursive(limit-1);
		}
	}

}
