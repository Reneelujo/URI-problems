package uripractice;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextFloat();
		double b = scan.nextFloat();
		double c = scan.nextFloat();
		
		double areaT = (a * c / 2);
		double areaC = (3.14159 * c * c);
		double areaTr = ((a + b) / 2 * c);
		double areaQ = (b * b);
		double areaR = (a * b);
		
		System.out.printf("TRIANGULO: %.3f\n", areaT);
		System.out.printf("CIRCULO: %.3f\n", areaC);
		System.out.printf("TRAPEZIO: %.3f\n", areaTr);
		System.out.printf("QUADRADO: %.3f\n", areaQ);
		System.out.printf("RETANGULO: %.3f\n", areaR);

	}

}
