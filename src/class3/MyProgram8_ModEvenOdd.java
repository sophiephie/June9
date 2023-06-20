package class3;

import java.util.Scanner;

public class MyProgram8_ModEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Give me num: ");
		
		int num = kb.nextInt();
		
		if(num %2 == 0) {
			System.out.println("Your number is even");
		} else {
			System.out.println("Your number is odd");
		}
		
		kb.close();
	
	

	}

}
