package Activitiy3;

import java.util.Scanner;

public class number21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the grades of your 5 classes");
	
		int mark1 = kb.nextInt();
		int mark2 = kb.nextInt();
		int mark3 = kb.nextInt();
		int mark4 = kb.nextInt();
		int mark5 = kb.nextInt();
		
		int avg = (mark1 + mark2 + mark3 + mark4 + mark5)/5;

		if (avg >= 60) {
			System.out.println("First division");
		} else if (avg >= 50) {
			System.out.println("Second division");
		} else if (avg >=40) {
			System.out.println("Third division");
		} else if (avg < 40) {
			System.out.println("Fail");
		}
		kb.close();

	}

}