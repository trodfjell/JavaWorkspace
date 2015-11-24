
public class Parkering {

	public static void main(String[] args) {
		System.out.println(beregnAvgift(45));
	}
	
	static double beregnAvgift(int antallTimer){
		int days = antallTimer / 24;
		int hours = antallTimer % 24;
		
		double fee = days * 180;
		
		if (hours <= 3){
			fee += 40;
		}
		
		else if (hours > 3 && hours < 17){
			fee += ((hours - 3) * 10) + 40;
		}
		else {
			fee += 180;
		}
		
		return fee;
		
		
		
		
		
		
	}


}
