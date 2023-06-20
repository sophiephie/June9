package Activitiy3;

import java.util.Scanner;

public class number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weekNum;
		String weekName;
		Scanner kb = new Scanner(System.in);

		System.out.print("Give me number of the week ");

		weekNum = kb.nextInt();

		switch (weekNum) {
		case 1:
			weekName = "Monday";
			break;
		case 2:
			weekName = "Tuesday";
			break;
		case 3:
			weekName = "Wednesday";
			break;
		case 4:
			weekName = "Thursday";
			break;
		case 5:
			weekName = "Friday";
			break;
		case 6:
			weekName = "Saturday";
			break;
		case 7:
			weekName = "Sunday";
			break;
		default:
			weekName = "an invalid month";
			break;
		}
		System.out.println("You entered " + weekName + ".");
		
		kb.close();


	}

}
