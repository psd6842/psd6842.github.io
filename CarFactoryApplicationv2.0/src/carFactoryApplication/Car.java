package carFactoryApplication;

import java.util.Date;
//import java.util.Calendar; 

abstract class Car {  
	private int orderID; 
	private Date orderDate; 
	
	public Date getDate() { 
		Date date = java.util.Calendar.getInstance().getTime(); 
		this.orderDate = date;
		return orderDate; 
		
	}
	
	
	
	
}
	

