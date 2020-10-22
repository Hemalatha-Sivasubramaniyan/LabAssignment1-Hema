/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Displaying Prime number for N natural Numbers


*/

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int index,index1, count=0;
		
		for(index = 1; index <=number; index++) {
			count=0;
			for(index1 = 2; index1 <= index/2; index1++) {
				if(index % index1 == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && number != 1 )
				System.out.print(index+" ");
		}
		
	}

}
