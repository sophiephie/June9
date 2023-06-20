package class3;

public class MyProgram1_Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		double price, taxRate, taxAmount, total;
		price = 165.99;
				taxRate = 0.318; 
		taxAmount = price * taxRate;
				
				//calculate total cost after adding taxes
				total = price + taxAmount;
				
		System.out.printf("Price is: $%4.2f", price);
		System.out.printf(" the tax amount is : %4.2f", taxAmount);
		System.out.println();
		System.out.println(total);

//		String stu1 = "Pargol davis", stu2 = "Mike Jason", stu3 = "Larry Simon";
//		int id1 = 923456, id2 = 645433, id3 = 635449;
//
//		System.out.println("No.      Student Name             ID#");
//		System.out.println("=====================================");
//
//		System.out.printf("1 %18S %16d %n", stu1, id1);
//		System.out.printf("2 %18s %16d %n", stu2, id2);
//		System.out.printf("3 %18s %16d %n", stu3, id3);
	}

}
