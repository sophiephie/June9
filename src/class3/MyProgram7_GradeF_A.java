package class3;

import java.util.Scanner;

public class MyProgram7_GradeF_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalMark;
		char grade;

		Scanner kb = new Scanner(System.in);

		System.out.println("Give me your total mark");
		totalMark = kb.nextDouble();

		if (totalMark < 50) { //Totally wrong
			grade = 'F';
		} else if (totalMark >= 50 && totalMark <=64) {
			grade = 'D';
		} else if (totalMark >= 65 && totalMark <=74) {
			grade = 'C';
		} else if (totalMark >= 75 && totalMark <=84) {
			grade = 'B';
		} else {
			grade = 'A';
		}

		System.out.printf("Based on your mark of %.2f the grade is : %s", totalMark, grade);

		kb.close();
	

	}

}
