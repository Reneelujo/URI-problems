package uripractice;

import java.util.Scanner;

public class ageindays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int years = input / 365;
		int months = (input % 365) / 30;
		int days = ((input % 365) % 30);
		
		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + " dia(s)");
	}

}
