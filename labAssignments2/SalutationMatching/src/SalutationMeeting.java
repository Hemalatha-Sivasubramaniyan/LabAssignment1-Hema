/**
 Author : Hemalatha
 Date : 23/10/20
 Desc : Sorting string in alphabetical order and changing string to uppercase and lowercase


*/

public class SalutationMeeting {

	public static void main(String[] args) {

	
		String name[][]= new String[3][];  // Array declaration and Instantiation
		name[0]=new String[3];
		name[1]=new String[1];
		name[2]=new String[1];
		name[0][0]="Mr.Prateek";
		name[0][1]="Mr.Rohan";
		name[0][2]="Mr.Rakesh";
		name[1][0]="Miss.Surya";
		name[2][0]="Mrs.Aishwarya";
		
	    for(int i=0;i<name.length;i++) {
		for(int j=0;j<name[i].length;j++) {
				System.out.println(name[i][j]);   //displaying the names
			}
		}
		
	}

}
