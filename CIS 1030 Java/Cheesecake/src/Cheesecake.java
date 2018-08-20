//Shannon P. Drake
//CIS 1030
//Programming Assignment #3: Vic's Sweetshop

import java.util.Scanner;

public class Cheesecake {
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
	
	//flavors declared
	final double PLAIN_CHEESECAKE_PPI = 0.50;
	final double STRAWBERRY_CHEESECAKE_PPI = 1.25;
	final double RASPBERRY_CHEESECAKE_PPI = 1.15;
	final double CARAMEL_CHEESECAKE_PPI = 0.75;
	final double CHOCOLATE_CHEESECAKE_PPI = 0.85;
	
	//sizes declared
	final int BITE_SIZE = 3;
	final int SMALL_SIZE = 9;
	final int LARGE_SIZE = 12;
	
	//various variables
	int userSize = 0;
	int userFlavor = 0;
	double userDouble = 0;
	double grandTotal = 0;

	
	//Getting Size
	
	System.out.println("Which size cheesecake would you like?");
	System.out.println("Please choose: ");
	System.out.println("1: Bite Size\n2: Small\n3: Large\n");
	
	userSize = scnr.nextInt();
	

	switch (userSize) {
	case 1:
		System.out.println("You have chosen Bite Size. Bite Size is: " + BITE_SIZE + " inches");
		userSize = BITE_SIZE; 
		break;
	case 2:
		System.out.println("You have chosen Small. Small is: " + SMALL_SIZE + " inches");
		userSize = SMALL_SIZE;
		break;
	case 3:
		System.out.println("You have chosen Large. Large is: " + LARGE_SIZE + " inches");
		userSize = LARGE_SIZE; 
		break;
	default:
	System.out.println("I'm sorry, I don't understand");
	break;
	}
	
	//Getting flavor
	System.out.println("Which flavor cheesecake would you like?");
	System.out.println("Please choose: ");
	System.out.println("1: Plain\n2: Strawberry\n3: Raspberry\n4: Caramel\n5: Chocolate\n");
	
	userFlavor = scnr.nextInt();
	
//I wanted to use a switch but couldn't quite grok it, so big ugly if-else it is
//I don't know if this is absurd or clever but it does seem to work
	
if (userFlavor == 1){
	System.out.println("You have chosen plain. Plain cheesecake costs: " + PLAIN_CHEESECAKE_PPI + " per inch");
	userDouble = PLAIN_CHEESECAKE_PPI; 
}
else if (userFlavor == 2) {
	System.out.println("You have chosen strawberry. Strawberry cheesecake costs " + STRAWBERRY_CHEESECAKE_PPI + " per inch");
	userDouble = STRAWBERRY_CHEESECAKE_PPI;
}
else if (userFlavor == 3) {
	System.out.println("You have chosen raspberry. Raspberry cheesecake costs " + RASPBERRY_CHEESECAKE_PPI + " per inch" );
	userDouble = RASPBERRY_CHEESECAKE_PPI;
}
else if (userFlavor == 4) {
	System.out.println("You have chosen caramel. Caramel cheesecake costs " + CARAMEL_CHEESECAKE_PPI + " per inch");
	userDouble = CARAMEL_CHEESECAKE_PPI;
}
else if (userFlavor == 5) {
	System.out.println("You have chosen chocolate. Chocolate cheesecake costs " + CHOCOLATE_CHEESECAKE_PPI + " per inch");
	userDouble = CHOCOLATE_CHEESECAKE_PPI;
}
//Calculations and final output
grandTotal = (userSize * userDouble); 

//I found this to fix the formatting issues
String grandTotalAsString = String.format("%.2f", grandTotal);

	System.out.println("That's " + userSize + " inches at " + userDouble + " per inch");
	System.out.println("Your total is: $" + grandTotalAsString);


	}

}
