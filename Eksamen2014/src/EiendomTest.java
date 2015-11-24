
public class EiendomTest {

	public static void main(String[] args) {
/**
		Lag en annen klasse med en main() metode hvor du oppretter to Eiendoms objekter, legger
		inn et par bud på hver av de (trenger ingen brukerdielog!), påkaller metoden
		skrivEiendom() og skriver til skjerm resultatet av et kall til getAntEiendommer()
*/
		System.out.println(Eiendom.getAntEiendommer());
		
		Eiendom eiendom1 = new Eiendom("Adresse 1", 4, 150);
		Eiendom eiendom2 = new Eiendom("Adresse 3", 2, 75);
		
		eiendom1.nyttBud(10000);
		eiendom1.nyttBud(20000);
		eiendom1.nyttBud(15000);
		
		eiendom2.nyttBud(10000);
		eiendom2.nyttBud(20000);
		eiendom2.nyttBud(1500000);
		
		eiendom1.skrivEiendom();
		eiendom2.skrivEiendom();
		
		System.out.println(Eiendom.getAntEiendommer());

		
		
		

	}

}
