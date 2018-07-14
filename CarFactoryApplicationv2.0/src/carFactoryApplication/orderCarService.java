package carFactoryApplication; 

import java.util.Scanner; 

public class orderCarService { 
	Car[] carOrders = new Car[4]; 
	int counter; 
	
	public void placeOrder() { 
		Scanner carScanner = new Scanner(System.in); 
		System.out.println("Please enter the color of your new vehicle"); 
		String color = carScanner.next(); 
		System.out.println("Please enter the model of your new vehicle"); 
		System.out.println("NOTE: Enter either Honda or Tata to make your selection"); 
		String model = carScanner.next(); 
		if(model == "Honda") { 
			Car car1 = new HondaCar(color); 
			counter += 1; 
			//if(counter > carOrders.length) { 
			//	Car[] carOrders1 = new Car[carOrders.length * 2]; 
			//}
			for(int i=0; i < carOrders.length; i++) { 
				if(carOrders[i] == null) { 
					carOrders[i] = car1; 
				}
			}
		}
		
		if(model == "Tata") { 
			Car car1 = new TataCar(color); 
			counter += 1; 
			for(int i=0; i < carOrders.length; i++) { 
				if(carOrders[i] == null) { 
					carOrders[i] = car1; 
				}
			}
		}
		
		else { 
			System.out.println("Invalid input"); 
		}
		
		carScanner.close(); 
	}
	
	public void displayOrders() { 
		for(int i=0; i < carOrders.length; i++) { 
			System.out.println(carOrders[i] + ",");
		}
	}
	
}