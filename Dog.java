import java.lang.Math;
public class Dog extends Animal{
	
	public Dog(String name, int year) {
		super(name, year);
	}
	
	double random = Math.random();
	public String noise(){
		if (random < 0.5){
			return "woof";
		}else{
			return "grrrr";
		}
	} 

}