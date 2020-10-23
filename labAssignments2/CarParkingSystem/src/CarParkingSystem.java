/**
 Author : Hemalatha
 Date : 23/10/20
 Desc : Creating 5 story car parking system


*/

import java.util.*;

class CarDetails{ //public class contains Car Details
	public String ownerName;
	public String registerNo;
	CarDetails(String ownerName, String registerNo){     
		this.ownerName = ownerName;
		this.registerNo = registerNo;
	}
}

public class CarParkingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CarDetails floors[][] = new CarDetails[5][]; //Jagged Array declaration and Instantiation
		floors[0]= new CarDetails[100];
		floors[1]= new CarDetails[70];
		floors[2]= new CarDetails[50];
		floors[3]= new CarDetails[20];
		floors[4]= new CarDetails[10];
		
		System.out.println("1) Park Car");     //Menu
		System.out.println("2) Get Car");
		System.out.println("3) Get Available Space");
		System.out.println("Enter the Choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:          // Logic for Parking
			
			System.out.println("Enter the Owner Name");
			String name = sc.next();
			System.out.println("Enter the Register Number");
			String regNo = sc.next();
			CarDetails cd = new CarDetails(name,regNo);
		loop:	for(int i=0;i<5;i++) {
				for(int j=0;j<floors[i].length;j++) {
					if(floors[i][j]==null) {        //checks if empty space is available or not
						floors[i][j]=cd;
						System.out.println("Your car is parked in number "+j+" in "+i+" story");
						break loop;
					}
					else {
						System.out.println("Sorry! Parking lot is full");
					}
				}
				
			}
			break;
			
		case 2:   //Logic for getting the parked car.
			
			System.out.println("Enter your car's Register Number");
			String carRegNo = sc.next();
			int floor=0,placeNo=0;
			for(int i=0;i<5;i++) {
				for(int j=0;j<floors[i].length;j++) {
					if(floors[i][j] != null) {
						CarDetails cdObj = floors[i][j];
						String temp = cdObj.registerNo;
						if(carRegNo.equalsIgnoreCase(temp)) {      // checks for the matching of 
							floor=i+1;                             //register number
							placeNo=j+1;
							floors[i][j]=null;
						}
					}
				}
			}
			if(floor==0 && placeNo==0) {
				System.out.println("The car was not found");
			}
			else {
				System.out.println("Your car is parked in number "+placeNo+" in "+floor+" story");
			}
			break;
			
			
		case 3:   //Logic for finding empty place
			
		loop: for(int i=0;i<5;i++) {
				for(int j=0;j<floors[i].length;j++) {
					if(floors[i][j] == null) {      // checks if empty place is available.
						System.out.println("There is an empty place in  "+j+" in "+i+" story");
						break loop;
					}
					else {
						System.out.println("Sorry! Parking lot is full");
					}
				}
			}
			break;
			
		default:
			System.out.println("Choose from the given options!");
		}
	}

}
