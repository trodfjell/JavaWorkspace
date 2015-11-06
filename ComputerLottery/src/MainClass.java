import java.util.*;

public class MainClass {
	
	private final static String fileName = "C:\\Users\\Truls\\Desktop\\StudentReal.csv";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Initializing...");
		
		System.out.println("Importing students...");
		
		//Liste med alle studentene og oppmøte, samt om de har vunnet eller ikke
		ArrayList<Student> allStudents = StudentImporter.importStudents(fileName);
		
		//Skriver ut studentene
		System.out.println("Done importing students:");
		printStudents(allStudents);
		
		System.out.println("Commands: \r\nStatus - Prints all the students. \r\nDraw - Draws one random student that has not won yet\r\nExit - Closes the application");
		
		
		// Loop to keep program running
		while (true) {
			System.out.println("Please enter a command:");
			String command = input.nextLine();
			
			// Status - Prints all the students
			if (command.equalsIgnoreCase("Status")) {
				printStudents(allStudents);
			}

			// TODO Draw - Draws one random student
			else if (command.equalsIgnoreCase("Draw")) {
				LotteryMachine.PickWinnerAndPrintResult(allStudents);
			}
			
			// Exit - Terminates the application
			else if (command.equalsIgnoreCase("Exit")) {
				input.close();
				System.out.println("Closing application.");
				System.exit(0);
				
			} else {
				System.out.println("Invalid command.");
			} 
		}	
	}
	
	public static void printStudents(ArrayList<Student> students){
		for (int i = 0; i < students.size(); i++){
			System.out.println(students.get(i).toString());
		}
	}

}
