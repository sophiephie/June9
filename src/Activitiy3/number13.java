package Activitiy3;

public class number13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1, b = -2, c = 1;
		double root1, root2;

		double value = b * b - 4 * a * c;

		if (value > 0) {

			root1 = (-b + Math.sqrt(value)) / (2 * a);
			root2 = (-b - Math.sqrt(value)) / (2 * a);

			System.out.printf("First root: %.2f %n", root1);
			System.out.printf("Second root: %.2f", root2);
		}

		else if (value == 0) {

			root1 = root2 = -b / (2 * a);
			System.out.format("First & Second root: %.2f;", root1);
		} else {
			System.out.format("Invalid roots");
		}

	}

}
