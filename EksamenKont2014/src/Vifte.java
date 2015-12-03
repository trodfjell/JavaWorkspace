
public class Vifte {

	//3 konstanter - konstanter har kodeord final
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	
	//Private datafelt fra oppgaven
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	//Default konstruktor - uten parametre
	public Vifte(){
		this.speed = SLOW;
		this.on = false;
		this.color = "Blue";
	}
	
	//En constructor hvor det skal være mulig å sette farge og radius, og om vifta er på eller av.
	public Vifte(String farge, double radius, boolean on){
		this.color = farge;
		this.radius = radius;
		this.on = on;
		this.speed = SLOW;
	}
	
	//Øker speed, kan ikke økes mer enn fast
	public void IncreaseSpeed(){
		if (this.speed < FAST){
			this.speed++;
		}
	}
	
	public String toString(){
		String speed = "";
		if (this.speed == SLOW){
			speed = "SLOW";
		}
		if (this.speed == MEDIUM){
			speed = "MEDIUM";
		}
		if (this.speed == FAST){
			speed = "FAST";
		}
		
		String result = "The speed is: " + speed + ", Color is " + this.color + ", Radius is: " + this.radius;
		
		if (!this.on){
			result = result + ". Vifta er av.";
		}
		
		return result;
	}
	
	//Set metode for speed
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	//Get metode for speed
	public int getSpeed(){
		return this.speed;
	}
	
	//Set metode for on
	public void setOn(boolean on){
		this.on = on;
	}
		
	//Get metode for on
	public boolean getOn(){
		return this.on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
