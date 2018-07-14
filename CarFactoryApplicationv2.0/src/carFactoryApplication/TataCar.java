package carFactoryApplication; 

public class TataCar extends Car {
	String model = "Tata Jaguar"; 
	String color = null; 
	String factory = "Mumbai"; 
	
	public TataCar(String color ) { 
		this.color = color;
		this.getDate(); 
		
	}
}