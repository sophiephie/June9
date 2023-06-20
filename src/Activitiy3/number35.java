package Activitiy3;

import java.util.Scanner;

public class number35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int num = sc.nextInt();

		if (num % 5 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();

	}

}
