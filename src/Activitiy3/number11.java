package Activitiy3;

import java.util.Scanner;

public class number11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double side1, side2, side3;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input 3 sides of a triangle ");
		side1 = kb.nextDouble();
		side2 = kb.nextDouble();
		side3 = kb.nextDouble();

		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		kb.close();

	}

}
