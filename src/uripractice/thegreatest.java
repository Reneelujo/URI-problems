package uripractice;

import java.util.Scanner;

public class thegreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int ab = (a + b + Math.abs(a - b))/2;  //The abs() method returns the absolute value of the argument.
		int abc = (ab + c + Math.abs (ab - c))/2;
		
				
				
		System.out.println(abc + " eh o maior");
		
		

	}

}
