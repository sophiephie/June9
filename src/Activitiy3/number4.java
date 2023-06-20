package Activitiy3;

import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner kb = new Scanner(System.in);
		
		System.out.print("Give me number ");
		
		int num = kb.nextInt();
		
		if(num %5 == 0 && num %11==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		kb.close();

	}

}
