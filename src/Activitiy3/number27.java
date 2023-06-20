package Activitiy3;

import java.util.Scanner;

public class number27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the length then the breadt of a rectangle");

		int leng = kb.nextInt();
		int brea = kb.nextInt();

		int area = leng * brea;
		int peri = (leng * 2) + (brea * 2);

		if (area > peri) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		kb.close();
	}

}
