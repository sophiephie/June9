package Activitiy3;

import java.util.Scanner;

public class number30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the Time Taken by Worker :");
		int hrs = kb.nextInt();
		if (hrs >= 2 && hrs <= 3) {
			System.out.println("Highly efficient");
		} else if (hrs > 3 && hrs <= 4) {
			System.out.println("Improve speed");
		} else if (hrs > 4 && hrs <= 5) {
			System.out.println("Training");
		} else {
			System.out.println("Need to leave");
		}
		kb.close();
	}

}
