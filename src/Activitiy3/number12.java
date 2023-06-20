package Activitiy3;

import java.util.Scanner;

public class number12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double side1, side2, side3;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input 3 sides of a triangle ");
		side1 = kb.nextDouble();
		side2 = kb.nextDouble();
		side3 = kb.nextDouble();

		if ((side1 == side2) && (side1 == side3)) {
			System.out.println("Equilateral");
		} else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
		kb.close();

	}

}
