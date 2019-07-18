package uripractice;

import java.util.Scanner;

public class consumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int distance = scan.nextInt();
		double fuel = scan.nextDouble();
		
		double average = distance/fuel;
		
		System.out.printf("%.3f km/l\n", average);
		
		
	}

}
