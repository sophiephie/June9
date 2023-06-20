package Activitiy3;

import java.util.Scanner;

public class number10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input 1st triangle angle");
		int ang1 = kb.nextInt();
		System.out.println("Input 1st triangle angle");
		int ang2 = kb.nextInt();
		System.out.println("Input 1st triangle angle");
		int ang3 = kb.nextInt();
		
		int total = ang1 + ang2 + ang3;
		
		if (total == 180) {
			System.out.println("Triangle is valid");
		}else {
			System.out.println("invalid triangle");
		}
	
		
		kb.close();
		
	}

}
