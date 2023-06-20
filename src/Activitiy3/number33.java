package Activitiy3;

import java.util.Scanner;

public class number33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && b > c) {
			System.out.println("decreasing order");
		} else if (c > b && b > a) {
			System.out.println("increasing order");
		} else {
			System.out.println("invalid order");
		}
				
sc.close();
	}

}
