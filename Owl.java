import java.lang.Math;
public class Owl extends Animal{
	
	private boolean Wise; //declaration
	
	public Owl(String name, int year, boolean wise) { //constructor
		super(name, year);
		this.Wise = wise; // Wise is from "private boolean Wise;" and wise "(String name, int year, boolean wise)"
	}
	
	double random = Math.random();
	public String noise(){
		if (random < 0.5){
			return "hoooo";
		}else{
			return "hoooo";
		}
	} 
	
	public String Wiseau(){
		if (this.Wise){
			return "wise";
		}else{
			return "not wise";
		}
	}
	
	@Override
	public String toString(){
		return "The animal's name is " + this.name + " , his or her age is " + (this.year - this.birthYear) + " years old and is " + Wiseau(); 
	}
	
}