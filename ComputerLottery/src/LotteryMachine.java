import java.util.*;

public class LotteryMachine {
	
	public static void PickWinnerAndPrintResult(ArrayList<Student> allStudents){
		
		//Assign lottery tickets
		ArrayList<String> tickets = assignLotteryTickets(allStudents);
		
		//Can be used to print out all tickets
		//for (int i = 0; i < tickets.size(); i++){
		//	System.out.print(tickets.get(i) + " ");
		//}
		
		addExitement();
		
		//Pick random winner
		String winner = pickRandomTicket(tickets);
		
		System.out.println("The winner is " + winner);
		
		//Set winner status to hasWon
		SetStudentStatusToHasWon(allStudents, winner);
		
	}
	
	private static String pickRandomTicket(ArrayList<String> tickets){
		Random rand = new Random();
		
		int winningIndex = rand.nextInt(tickets.size());
		
		return tickets.get(winningIndex);
	}
	
	private static ArrayList<String> assignLotteryTickets(ArrayList<Student> allStudents){
		
		ArrayList<String> tickets = new ArrayList<String>();
		
		for (int i = 0; i < allStudents.size(); i++){
			Student student = allStudents.get(i);
			
			if (student.hasWon() == false){
				for (int j = 1; j <= student.getNumberOfAttendances(); j++){
					tickets.add(student.getName());
				}
			}
		}
		
		return tickets;
	}
	
	
	/** Searches for a student in the list, and sets hasWon to true.*/
	private static  void SetStudentStatusToHasWon(ArrayList<Student> students, String name){
		for (int i = 0; i < students.size(); i++){
			Student student = students.get(i);
			if (student.getName().equalsIgnoreCase(name)){
				student.setHasWonToTrue();
			}
		}
	}
	
	private static void addExitement(){
		for (int i = 5; i > 0; i--){
			System.out.println(i + "...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}
