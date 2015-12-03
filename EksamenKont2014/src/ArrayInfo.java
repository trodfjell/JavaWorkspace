
public class ArrayInfo {

	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8,0,0};
		System.out.println("Forskjell største / minste = " +
				arrayInfo(arr,8,1));
		System.out.println("Sum = " + arrayInfo(arr,8,2));
		System.out.println("Snitt = " + arrayInfo(arr,8,3));
	}
	
	//Oppgave 2a
	public static double arrayInfo(int[] intArray, int antallElementer, int svar){
		
		//Variabler for å ta vare på verdier underveis
		int smallest = intArray[0];
		int biggest = 0;
		int sum = 0;
		
		//Løkke som går igjennom spesifisert lengde av arrayen
		for (int i = 0; i < antallElementer; i++){
			//Sjekk om tallet er mindre enn minste tall
			if (smallest > intArray[i]){
				smallest = intArray[i];
			}
			//Sjekk om tallet er større enn største tall
			if (biggest < intArray[i]){
				biggest = intArray[i];
			}
			//Plusse tallet på summen
			sum += intArray[i];
		}
		
		if (svar == 1){
			//Forskjell størst minst
			return biggest - smallest;
		}
		else if (svar == 2){
			//Sum
			return sum;
		}
		else if (svar == 3){
			//Snitt
			return (double)sum / (double)antallElementer;
		}
		else {
			//Noe er galt
			System.out.println("Wrong command");
			return -1;
		}
	}
	
	//Oppgave 2b
	public int[] diagonal(int[][] twoDimArray){
		
		int[] result = new int[twoDimArray.length];
		for (int i = 0; i < twoDimArray.length; i++){
			result[i] = twoDimArray[i][i];
		}
		
		return result;
	}
}
