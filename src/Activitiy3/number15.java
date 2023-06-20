package Activitiy3;

import java.util.Scanner;

public class number15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double phyMark;
		double cheMark;
		double bioMark;
		double mathMark;
		double comMark;
		char grade;

		Scanner kb = new Scanner(System.in);

		System.out.println("Whats your mark in Physics?");
		phyMark = kb.nextDouble();

		if (phyMark >= 85) {
			grade = 'A';
		} else if (phyMark >= 75) {
			grade = 'B';
		} else if (phyMark >= 65) {
			grade = 'C';
		} else if (phyMark >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Your grade for Physics is : " + grade);

		System.out.println("=====================");

		System.out.println("Whats your mark in Chemistry?");
		cheMark = kb.nextDouble();

		if (cheMark >= 85) {
			grade = 'A';
		} else if (cheMark >= 75) {
			grade = 'B';
		} else if (cheMark >= 65) {
			grade = 'C';
		} else if (cheMark >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Your grade for Chemistry is : " + grade);

		System.out.println("=====================");

		System.out.println("Whats your mark in Biology?");
		bioMark = kb.nextDouble();

		if (bioMark >= 85) {
			grade = 'A';
		} else if (bioMark >= 75) {
			grade = 'B';
		} else if (bioMark >= 65) {
			grade = 'C';
		} else if (bioMark >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Your grade for Biology is : " + grade);

		System.out.println("=====================");

		System.out.println("Whats your mark in Mathematics?");
		mathMark = kb.nextDouble();

		if (mathMark >= 85) {
			grade = 'A';
		} else if (mathMark >= 75) {
			grade = 'B';
		} else if (mathMark >= 65) {
			grade = 'C';
		} else if (mathMark >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Your grade for Mathematics is : " + grade);

		System.out.println("=====================");

		System.out.println("Whats your mark in Computer?");
		comMark = kb.nextDouble();

		if (comMark >= 85) {
			grade = 'A';
		} else if (comMark >= 75) {
			grade = 'B';
		} else if (comMark >= 65) {
			grade = 'C';
		} else if (comMark >= 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.printf("Your grade for Computer is : " + grade);

		kb.close();

	}

}
