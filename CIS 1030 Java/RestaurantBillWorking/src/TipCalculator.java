
/**
 * @author shannon
 *
 */

//get dat scanner
import java.util.Scanner;

public class TipCalculator {

 static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Dec dem variables mhmm
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
		mealTotal = scnr.nextDouble();
		System.out.println("Whirr whirr whirr KTHUNK.../n");
		
		//MATH
		taxAmount = ogBillAmount * salesTax;
		taxTotal = ogBillAmount + taxAmount;
		tipAmount = ogBillAmount * tipPercent;
		tipTotal = taxTotal + tipAmount;
		
		
		//output OH YEAH
		System.out.println("Your original bill amount is: " + ogBillAmount);
		System.out.println("Your sales tax is: " + taxAmount);
		System.out.println("Your total with tax is: " + taxTotal);
		System.out.println("Your tip amount is: " + tipAmount);
		System.out.println("Your total with tip is:" + tipTotal);
		
		return;

	}

}
