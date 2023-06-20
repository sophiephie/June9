package Activitiy3;

import java.util.Scanner;

public class number24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("What is Ram's age?");
		int ram = kb.nextInt();
		System.out.println("What is Shyam's age?");
		int shyam = kb.nextInt();
		System.out.println("What is Ajay's age?");
		int ajay = kb.nextInt();

		int minAge;

		if (ram < shyam && ram < ajay) {
			minAge = ram;
		} else if (shyam < ram && shyam < ajay) {
			minAge = shyam;
		} else {
			minAge = ajay;
		}

		System.out.println("Youngest one is " + minAge);
		kb.close();

	}
}