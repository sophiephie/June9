package class3;

import java.util.Scanner;

public class MyProgram5_IfMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, minValue;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the first value");
		num1 = kb.nextInt();
		System.out.println("Please enter the 2nd value");
		num2 = kb.nextInt();
		System.out.println("Please enter the 3rd value");
		num3 = kb.nextInt();
		
		if(num1 < num2) {
			if(num1< num3) {
				minValue = num1;
			}else {
				minValue = num3;
			}
		}else {
			if (num2 < num3) {
				minValue = num2;
			}else {
				minValue = num3;
			}
		}
		
		System.out.println("the min value is " + minValue);
		
		kb.close();
	}

}
