package class3;

public class MyProgram12_IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Pargol";
		String name2 = "PARGOL";
		
//		if (name1 == name2) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
//		

		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("Yes");
			
		} else {
			System.out.println("No");
		}
	}

}
