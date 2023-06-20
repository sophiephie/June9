package Activitiy3;

import java.util.Scanner;

public class number28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		double hard, carb, tens;
		
		System.out.println("Input the hardness, carbon content and the tensile strength of the steel");
		hard = kb.nextDouble();
		carb = kb.nextDouble();
		tens = kb.nextDouble();
		
		if (hard > 50 && carb < 0.7 && tens > 5600 ) {
			System.out.println("Grade 10");
		} else if (hard > 50 && carb < 0.7 && tens < 5600 ) {
			System.out.println("Grade 9");
		} else if (hard < 50 && carb < 0.7 && tens > 5600 ) {
			System.out.println("Grade 8");
		} else if (hard > 50 && carb > 0.7 && tens > 5600 ) {
			System.out.println("Grade 7");
		} else if (hard > 50 || carb < 0.7 || tens > 5600) {
			System.out.println("Grade 6");
		} else {
			System.out.println("Grade 5");
		}
		kb.close();
		
	}

}
