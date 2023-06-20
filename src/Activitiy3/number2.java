package Activitiy3;

import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input 1st number");
		int a = kb.nextInt();
		System.out.println("Input 2nd number");
		int b = kb.nextInt();
		System.out.println("Input 3rd number");
		int c = kb.nextInt();
		System.out.println("Input 4th number");
		int d = kb.nextInt();
		
		int max1 = Math.max(a, b);
		int max2 = Math.max(c, d);
				
		System.out.println("The greatest number is " + Math.max(max1, max2));
		
	

		kb.close();

	}

}

