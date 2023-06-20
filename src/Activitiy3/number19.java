package Activitiy3;

import java.util.Scanner;

public class number19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Whats the current year and which year did you join the company?");
		int current = kb.nextInt();
		int join = kb.nextInt();
		int duration = current - join;
		
		if (duration >3) {
			System.out.println("your will receive your bonus");
		} else {
			System.out.println("End of program");
		}
		
		kb.close();
	}

}
