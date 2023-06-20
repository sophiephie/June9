package Activitiy3;

import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String food1 = "Carrots", food2 = "Onions", food3 = "Meat";
		int price1 = 2, price2 = 4, price3 = 10;

		System.out.println("No.      Food Item       Price Per Pound");
		System.out.println("========================================");

		System.out.printf("1 %15S %22d %n", food1, price1);
		System.out.printf("2 %15S %22d %n", food2, price2);
		System.out.printf("3 %15S %22d %n", food3, price3);
		System.out.println("");

		Scanner kb = new Scanner(System.in);
		System.out.println("How many lbs do you need?");
		int lbs = kb.nextInt();
		
		int carr = lbs * 2;
		int onio = lbs * 4;
		int meat = lbs * 10;
		double total = carr + onio + meat;
		
		System.out.printf("Your total is: $%4.2f %n", total);
		
		System.out.println("Are you paying by cash or card?");
		String pay = kb.next();
		
		double taxRate, taxAmount, withTax;
		
		taxRate = 0.13; 
		taxAmount = total * taxRate;
		withTax = total + taxAmount;
		
		if (pay.equalsIgnoreCase("card")) {
			System.out.printf("Your total with card is: $%4.2f %n", withTax);
		} else {
			System.out.printf("Your total with cash is: $%4.2f %n", total);
		}
		kb.close();
	}

}
