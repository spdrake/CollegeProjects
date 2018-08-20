//Shannon P. Drake
//CIS 1030
//EvenNums for Assignment 5

public final class EvenNums {

	public static void main(String[] args) {
		// I was doing this one waay but like it better this way
		
		//Setting up my loop
		for (int counterDigit = 2; counterDigit <= 100;) {
			System.out.print(counterDigit);
			if (counterDigit % 20 == 0) {
				System.out.print("\n");
			}
			counterDigit= counterDigit + 2;
		}


		
	
	}
}