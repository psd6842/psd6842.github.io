package carFactoryApplication;

import java.util.Scanner;

public class carFactoryApplication { 
	
	public static void main(String[] args) { 
		
		Scanner orderScanner = new Scanner(System.in); 
		System.out.println("Welcome to the Car Factory!");
		System.out.println("Please select from one of the following options:");
		System.out.println("\n1. Order Vehicle \n2. View Orders\n3. Quit");
		
		int choice = orderScanner.nextInt();
		
		orderScanner.close();
		
		orderCarService order = new orderCarService(); 
		
		if(choice == 1) { 
			order.placeOrder();
		}
		
		if(choice == 2) { 
			order.displayOrders();
		}
		
		if(choice ==3) { 
			System.exit(0);
		}
		
	}
}