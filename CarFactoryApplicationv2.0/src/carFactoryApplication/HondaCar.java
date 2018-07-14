package carFactoryApplication; 

public class HondaCar extends Car { 
	String model = "Honda Accord"; 
	String color = null; 
	String factory = "Delhi"; 
	
	public HondaCar(String color) { 
		this.color = color; 
		this.getDate(); 
	}
}