
public class Datamaskin {
	
	//Constructor uten parametre
	//Denne finnes dersom ingen konstructor er oppgitt
	public Datamaskin(){
		this.on = false;
		numberOfObjects++;
	}
	
	//Constructor med parametre
	public Datamaskin(int Ram, int skjermst�rrelse){
		this.Ram = Ram;
		this.skjermst�rrelse = skjermst�rrelse;		
		this.on = false;
		numberOfObjects++;
	}
	
	
	//Har properties (egenskaper) for � beskrive objektet
	public int Ram;
	public int skjermst�rrelse;
	public boolean on;
	
	//Static properties trenger ikke � ha et objekt for � aksesseres
	public static int numberOfObjects = 0; //Delt mellom alle instanser av klassen (objekter)
	
	
	//Har metoder for � beskrive oppf�rsel
	//Ikke statisk metode, trenger objekt for � kalles
	//Kan bruke ikke statiske og statiske properties og metoder
	public void OnOffButton(){
		if (on){
			on = false;
		}
		else {
			on = true;
		}
	}
	
	//Statisk metode, trenger ikke et objekt for � kunne kalles
	//Kan ikke bruke ikke statiske properties og metoder p� et objekt
	public static void PrintNumberOfObjects(){
		System.out.println(numberOfObjects);
	}
	
	
	
	
	
}
