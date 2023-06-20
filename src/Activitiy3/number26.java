package Activitiy3;

import java.util.Scanner;

public class number26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Give me any negative or positive number");

		int num = kb.nextInt();

		System.out.println(Math.abs(num));
		kb.close();

	}

}
