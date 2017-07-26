import java.lang.Math;
public class Cat extends Animal{
	
	public Cat(String name, int year) { 
		super(name, year);
	}
	
	double random = Math.random();
	public String noise(){
		if (random < 0.5){
			return "meow";
		}else{
			return "prrr";
		}
	} 
}