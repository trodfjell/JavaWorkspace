import java.util.Scanner;

public class Salg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][] salesPersons = new int [5][4];
		int [] productPrice = { 200, 400, 600, 1000 };

		System.out.print("Enter salesperson (0-4) (-1 to quit): ");
		int salesPerson = scan.nextInt();
		
		while (salesPerson != -1){
			
			System.out.print("Enter product code (0-3):");
			int productCode = scan.nextInt();
			
			System.out.print("Enter quantity:");
			int quantity = scan.nextInt();
			
			salesPersons[salesPerson][productCode] += quantity;
			
			System.out.print("Enter salesperson (0-4) (-1 to quit): ");
			salesPerson = scan.nextInt();
		}
		
		for (int i = 0; i < salesPersons.length; i++){
			int total = 0;
			for (int j = 0; j < salesPersons[i].length; j++){
				total += salesPersons[i][j] * productPrice[j];
			}
			System.out.println("Total for salesperson " + i + " is: " + total);
		}
		
		
		
	}

}
