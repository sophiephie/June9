package class3;

import java.util.Scanner;

public class MyProgram9_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * switch (exp) { case val1: whatever break; case val2: another thing... }
		 */

		int monthNum;
		String monthName;
		Scanner kb = new Scanner(System.in);

		System.out.print("Give me number of any month ");

		monthNum = kb.nextInt();

		switch (monthNum) {
		case 1:
			monthName = "Jan";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "an invalid month";
			break;

		}
		
		System.out.println("You entered " + monthName + ".");
		
		kb.close();
		

	}

}
