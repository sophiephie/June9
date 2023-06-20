package Activitiy3;

import java.util.Scanner;

public class number14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your sales amount");
		double sales = kb.nextDouble();
		System.out.println("Enter your expense amount");
		double exp = kb.nextDouble();
		
		double total = sales - exp;
		
		if (total <=0) {
			System.out.println("Loss");
		} else {
			System.out.println("Profit");
		}
		
	kb.close();

	}

}
