import java.util.*;

public class LotteryMachine {
	
	public void PickWinnerAndPrintResult(ArrayList<Student> allStudents){
		
	}
	
	private String pickRandomTicket(ArrayList<String> tickets){
		// TODO
		return null;
		
		
		
	}
	
	private ArrayList<String> assignLotteryTickets(ArrayList<Student> allStudents){
		
		ArrayList<String> tickets = new ArrayList<String>();
		
		for (int i = 0; i < allStudents.size(); i++){
			Student student = allStudents.get(i);
			
			for (int j = 1; j <= student.getNumberOfAttendances(); j++){
				tickets.add(student.getName());
			}
		}
		
		return tickets;
	}
	
	
	/** Searches for a student in the list, and sets hasWon to true.*/
	private void SetStudentStatusToHasWon(ArrayList<Student> students, String name){
		for (int i = 0; i < students.size(); i++){
			Student student = students.get(i);
			if (student.getName().equalsIgnoreCase(name)){
				student.setHasWonToTrue();
			}
		}
	}
	
	
	
	

}
