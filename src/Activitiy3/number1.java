package Activitiy3;

import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a positive or negative number");

		int num = kb.nextInt();

		if (num > 0) {
			System.out.println("You number is positive");
		} else if (num >=0) {
			System.out.println("its neither positive or negative");
		} else {
			System.out.println("Your number is negative");
		}

		kb.close();
	}

}
