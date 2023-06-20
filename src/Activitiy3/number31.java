package Activitiy3;

import java.util.Scanner;

public class number31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input me 3 numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a == b && a == c) {
			System.out.println("Yes it is equal");
		} else {
			System.out.println("No its not equal");
		}

		sc.close();
	}

}
