package Activitiy3;

import java.util.Scanner;

public class number18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Input the price of the item then the quantity");

		double price = kb.nextDouble();
		int quant = kb.nextInt();

		if (quant > 100) {
			double total = (price * quant) * 0.9;
			System.out.printf("Your total is $%4.2f", total);
		} else {
			double total = price * quant;
			System.out.printf("Your total is $%4.2f", total);
		}

		kb.close();
	}

}
