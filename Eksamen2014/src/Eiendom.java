import java.util.Arrays;

public class Eiendom {
	
	private String adresse;
	private int antallRom;
	private int antallKvm;
	private double[] bud;
	private static int antallEiendommer = 0;
	private int antallBud;
	
	public Eiendom(String adresse, int antallRom, int antallKvm) {
		this.adresse = adresse;
		this.antallRom = antallRom;
		this.antallKvm = antallKvm;
		this.bud = new double[20];
		this.antallEiendommer++;
		this.antallBud = 0;
	}

	public void nyttBud(double budBelop){
		if (this.antallBud == 0){
			this.bud[0] = budBelop;
			this.antallBud++;
		}
		else if (this.bud[this.antallBud - 1] < budBelop){
			//Doble størrelsen hvis tabellen er for liten
			if (this.bud.length == this.antallBud){
				double[] nyTabell = new double[this.antallBud * 2];
				System.arraycopy(this.bud, 0, nyTabell, 0, this.bud.length);
				this.bud = nyTabell;
				
				//Alternativ løsning
				//for (int i = 0; i < this.bud.length; i++){
				//	nyTabell[i] = this.bud[i];
				//}
				//this.bud = nyTabell;
			}
			
			this.bud[this.antallBud] = budBelop;
			this.antallBud++;
		}
		else {
			System.out.println("Dette budet er ikke høyt nok. Siste bud var " + this.bud[this.antallBud - 1]);
		}
	}
	
	public void skrivEiendom(){
		System.out.println("Adresse : " + this.adresse);
		System.out.println("Antall rom : " + this.antallRom);
		System.out.println("Antall kvm : " + this.antallKvm);
		System.out.println("Følgende bud er gitt :");
		
		for (int i = 0; i < this.antallBud; i++){
			System.out.println(this.bud[i]);
		}
	}
	
	public static int getAntEiendommer(){
		return antallEiendommer;
	}
	
	
}
