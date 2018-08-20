//Shannon P. Drake
//CIS 1030
//Homework 5
//Input123

import java.util.Scanner;

public final class Input123 {

	public static void main(String[] args) {
	
		//getting scanner and variables
		Scanner scnr = new Scanner (System.in);
		int userInput = 0; 

		while (userInput != 4) {
			System.out.println("Please type 1, 2, 3, or 4: ");
			userInput = scnr.nextInt();
			
			//I had a bunch of trouble with this but I think the problem was in my nesting
			
			//Edit: yep, that was it
			
			//So here's the switchboard
			switch (userInput) {
			case 1:
				System.out.println("Good job!!");
				break;
			case 2:
				System.out.println("Good job!!");
				break;
			case 3:
				System.out.println("Good job!!");
				break;
			case 4:
				break;
			
			default:
				System.out.println("No, really.");
				break;
			}
			
		}
		
		
	}

}
