package uripractice;

import java.util.Scanner;

public class SimpleCalculate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int code1 = scan.nextInt();
		int numb1 = scan.nextInt();
		double units1 = scan.nextDouble();
		
		int code2 = scan.nextInt();
		int numb2 = scan.nextInt();
		double units2 = scan.nextDouble();
		
		double total = ((numb1 * units1) + (numb2 * units2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		

	}

}
