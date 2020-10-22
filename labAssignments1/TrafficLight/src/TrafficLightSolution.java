/**
 Author : Hemalatha
 Date : 22/10/20
 Desc : Traffic Light Signal


*/



import java.util.*;

public class TrafficLightSolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1) Red");
		System.out.println("2) Yellow");
		System.out.println("3) Green");
		System.out.println("Enter the Choice:");
		int choice = sc.nextInt(); 
		
		switch(choice) {
		    
		case 1:
			System.out.println("STOP");
			break;
			
		case 2:
			System.out.println("READY");
			break;
			
		case 3:
			System.out.println("GO");
			break;
			
			default:
				System.out.println("Wrong Choice");
			
		}
			
	}

}
