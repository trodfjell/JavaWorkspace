
public class Student {
	
	private String name;
	private int numberOfAttendances;
	private boolean hasWon;
	
	
	public Student(String name, int attendances){
		this.name = name;
		this.numberOfAttendances = attendances;
		this.hasWon = false;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfAttendances() {
		return numberOfAttendances;
	}


	public boolean hasWon() {
		return hasWon;
	}
	
	public void setHasWonToTrue(){
		this.hasWon = true;
	}
	
	
	
}
