
public class MethodExample {

	public int value = 5;
	
	public static void main(String[] args) {
		int a = 5; 
		//a er uendret selv om metoden har doblet verdien siden kun verdien har blitt tatt inn i metoden
		MethodWithParams(a); 
	}
	
	//public void <metodenavn>- trenger ikke return statement
	//public metoder kan brukes hvor som helst
	public void VoidTest(){
		System.out.println("Test");
	}
	
	//public <datatype> <metodenavn>- trenger return statement med <datatype>
	//Private kan kun kalles inne i samme klasse
	private int IntTest(){


		return 10; //Må ha denne statementen siden det er en int metode
		
	}
	
	//Dersom ikke public eller private er oppgitt - kan metoden brukes i samme prosjekt

	/** PARAMETER EKSEMPEL */
	public static void MethodWithParams(int a){ //Datatyper i parantes er parametere, kan brukes inne i metoden
		
		//Hvis parameter er primær datatype (int, double, long, char osv (små bokstaver)):
		//Da er datatypen er verditype (value type) og verdien kopieres inn i metoden
		//Verdien kan endres underveis, men vil ikke endres utenfor metoden
		
		//Verdien endres inne i metoden, men ikke utenfor
		a = a * 2;
		
	}
	
	public static void MethodWithParamsReferenceType(MethodExample example){
		//MethodExample er en referansetype, verdier som endres på referansetyper, blir også endret utenfor metoden
		example.value = 10;
	}
	
	
}
