package Activitiy3;

import java.util.Scanner;

public class number23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a 5 digits");

		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		int num4 = kb.nextInt();
		int num5 = kb.nextInt();

		if (num1 == num5 && num2 == num4) {
			System.out.println("It is equal");
		} else {
			System.out.println("not equal");
		}
		kb.close();

	}

}
