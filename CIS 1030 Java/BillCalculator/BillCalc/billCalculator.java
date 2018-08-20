package BillCalc;
import java.util.Scanner;
public final class billCalculator {

	public static void main(String[] args) {
		//bleep bleep
		

		Scanner scnr = new Scanner(System.in);
		
		//
		double mealTotal = 0;
		double taxTotal = 0;
		double taxAmount = 0; 
		double tipAmount = 0;
		double ogBillAmount = 0;
		double salesTax = .075;
		double tipPercent = .18;
		double tipTotal = 0; 
		
		//Get Input aww yiss
		System.out.println("Enter meal total: ");
		ogBillAmount = scnr.nextDouble();
		System.out.println("Whirr whirr whirr KTHUNK...");
	
		
		//MATH
		taxAmount = ogBillAmount * salesTax;		
		taxTotal = ogBillAmount + taxAmount;
		tipAmount = ogBillAmount * tipPercent;
		tipTotal = taxTotal + tipAmount;
		
		
		//I know there is a way to make this round to 2 decimal places but I cannot figure it out
		//And to be fair it's not in the spec
		System.out.println("Your original bill amount is: " + ogBillAmount);
		System.out.println("Your sales tax is: " + taxAmount);
		System.out.println("Your total with tax is: " + taxTotal);
		System.out.println("Your tip amount is: " + tipAmount);
		System.out.println("Your total with tip is: " + tipTotal);
		
		return;

	}

}


