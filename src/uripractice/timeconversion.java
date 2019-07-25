package uripractice;

import java.util.Scanner;

public class timeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int hour = input / 3600;
		int min = (input % 3600) / 60; 
		int sec = input % 3600 % 60;
		
		System.out.printf("%d:%d:%d\n", hour, min, sec);  //%d is used to show that input will be of some int value
		
		
		

	}

}
