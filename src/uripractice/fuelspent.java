package uripractice;

import java.util.Scanner;

public class fuelspent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		double time = scan.nextDouble();
		double speed = scan.nextDouble();
		
		 
		double liters = ((speed / 12)* time);
				
		System.out.printf("%.3f\n", liters);
		
	}

}
