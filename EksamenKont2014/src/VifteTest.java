
public class VifteTest {

	public static void main(String[] args) {
		Vifte vifte1 = new Vifte();
		Vifte vifte2 = new Vifte("Red", 15.0, false);
		
		vifte2.IncreaseSpeed();
		
		System.out.println(vifte2.toString());
		
		vifte2.setOn(true);
		
		System.out.println(vifte2.toString());
	}

}
