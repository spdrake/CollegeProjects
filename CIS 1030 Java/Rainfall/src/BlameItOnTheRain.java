//Shannon P. Drake
//CIS 1030
//Assignment 6

import java. util.Scanner;
public final class BlameItOnTheRain {

	public static void main(String[] args) {
		//Getting my Scanner
		Scanner scnr = new Scanner(System.in);
		
		//Setting up an array and variables
		
		
		double rainfallTotal = 0;
		double rainfallByMonth[] =new double[12];
		double rainfallInches;
		double rainfallAverage;
	
		
		//Prompting the user
		System.out.println("Enter the amount of rainfall, by month, from January to December:");
		
		//Loop to get input
		for (int i=0;i<12;i++) {
			rainfallInches=scnr.nextDouble();
			
			//Prevent negative values
			while(rainfallInches < 0){
			System.out.println("Please enter a positive value:");
			}
			rainfallByMonth[i]=rainfallInches;
		}
		//Output
		System.out.println("The total rain is: " + totalRain(rainfallByMonth));
		System.out.println("The average rainfall is: " + avgRain(rainfallByMonth));
		System.out.println("The most rain fell: " + mostRain(rainfallByMonth));
		System.out.println("The least rain fell: " + leastRain(rainfallByMonth));
	}

		//Math functions
		static double totalRain(double [] array) {
			double sum = 0;
			for(int i = 0; i < array.length ; i++) {
				sum += array[i];
			}
			return sum;
			}
		
		static double avgRain(double [] array) {
			double average = 0;
			average = totalRain(array)/array.length;
			return average;
		}

		
	static double mostRain(double[] array) {
		double most = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > most) {
				most=array[i];
			}
		}
			return most; 
		}
		
		static double leastRain(double[] array) {
			double least = array[0];
			for (int i = 0; i < array.length; i++) {
				if (array[i] < least) {
					least = array[i];
				}
				}
				return least;
		}
		
		 
}
