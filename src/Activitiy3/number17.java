package Activitiy3;

import java.util.Scanner;

public class number17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unsure about the last condition about the question

		Scanner kb = new Scanner(System.in);

		System.out.println("Input the electricity unit charges");
		int unit = kb.nextInt();
		double price = 0.0;

		if (unit <= 50) {
			price = (unit * 0.5);
		} else if (unit <= 200) {
			price = ((50 * 0.5) + ((unit - 50) * 0.75));
		} else if (unit <= 450) {
			price = ((50 * 0.5) + (150 * 0.75) + ((unit - 200) * 1.2));
		} else {
			price = ((50 * 0.5) + (150 * 0.75) + (250 * 1.2) + ((unit - 450) * 1.5));
		}

		System.out.printf("Total bill is $%4.2f", (price) * 1.2);
		kb.close();
	}

}
