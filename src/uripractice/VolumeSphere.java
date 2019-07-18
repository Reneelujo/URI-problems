package uripractice;

import java.util.Scanner;

public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double R = scan.nextDouble();
		
		double volume = ((4.0/3) * 3.14159 * R*R*R);
		
		System.out.printf("VOLUME = %.3f\n",volume);

		
	}

}
