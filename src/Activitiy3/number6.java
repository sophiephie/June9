package Activitiy3;

import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner kb = new Scanner(System.in);
		
		System.out.print("Give me a year ");
		
		int year = kb.nextInt();
		
		if(year %4 == 0) {
			System.out.println("its a leap year");
		} else {
			System.out.println("not leap year");
		}
		
		kb.close();
		
		

	}

}
