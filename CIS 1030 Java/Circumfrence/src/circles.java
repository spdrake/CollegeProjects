
import java.util.Scanner; 

public class circles {


	
	public static void main(String[] args) {
		final double PI = 3.14159; //mmm pie
		double userDiameter = 0; // declared
		double userCircumference = 0; //declared
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter diameter of circle: ");
		userDiameter = scan.nextDouble();
		
		userCircumference = (PI * userDiameter);
		
		System.out.println("The circumference is: " + userCircumference);
		

	}

}
