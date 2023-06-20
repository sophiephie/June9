package Activitiy3;

import java.util.Scanner;

public class number29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("How many days late?");
		int day = kb.nextInt();
		
		double fee;

		if (day <= 5) {
			fee = day * 0.5;
			System.out.printf("Your late fee is $%4.2f", fee);
		} else if (day <= 10) {
			fee = day * 1;
			System.out.printf("Your late fee is $%4.2f", fee);
		} else if (day > 10) {
			fee = day * 5;
			System.out.printf("Your late fee is $%4.2f", fee);
		}


		kb.close();
	}

}
