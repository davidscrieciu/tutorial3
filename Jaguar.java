import java.lang.Math;
public class Jaguar extends Cat{
	
	public Jaguar(String name, int year) { 
		super(name, year);
	}
	
	double random = Math.random();
	public String noise(){
		if (random < 0.5){
			return "ROAR";
		}else{
			return "RRRRRRR";
		}
	} 
}