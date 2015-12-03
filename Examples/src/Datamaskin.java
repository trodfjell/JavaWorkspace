
public class Datamaskin {
	
	//Constructor uten parametre
	//Denne finnes dersom ingen konstructor er oppgitt
	public Datamaskin(){
		this.on = false;
		numberOfObjects++;
	}
	
	//Constructor med parametre
	public Datamaskin(int Ram, int skjermstørrelse){
		this.Ram = Ram;
		this.skjermstørrelse = skjermstørrelse;		
		this.on = false;
		numberOfObjects++;
	}
	
	
	//Har properties (egenskaper) for å beskrive objektet
	public int Ram;
	public int skjermstørrelse;
	public boolean on;
	
	//Static properties trenger ikke å ha et objekt for å aksesseres
	public static int numberOfObjects = 0; //Delt mellom alle instanser av klassen (objekter)
	
	
	//Har metoder for å beskrive oppførsel
	//Ikke statisk metode, trenger objekt for å kalles
	//Kan bruke ikke statiske og statiske properties og metoder
	public void OnOffButton(){
		if (on){
			on = false;
		}
		else {
			on = true;
		}
	}
	
	//Statisk metode, trenger ikke et objekt for å kunne kalles
	//Kan ikke bruke ikke statiske properties og metoder på et objekt
	public static void PrintNumberOfObjects(){
		System.out.println(numberOfObjects);
	}
	
	
	
	
	
}
