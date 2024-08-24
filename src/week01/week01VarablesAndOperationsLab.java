//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class week01VarablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week 1 Lab");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availPlaneSeats = 18;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceryCheckoutPrice = 30.00; 
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'F';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String custFirstName = "Adam";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "5555 Pennsylvania Ave";

		// 7. Print all variables to the console
		System.out.println("Available Plane Seats: "+availPlaneSeats);
		System.out.println("Grocery Checkout Price: $"+groceryCheckoutPrice);		
		System.out.println(middleInitial+" is your middle initial");
		System.out.println("True or False: Is it hot outside? "+hotOutside);
		System.out.println("Customer First Name: "+custFirstName);
		System.out.println("Customer Address: "+streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availPlaneSeats = availPlaneSeats - 2;
		//quicker way to do it:
		//availPlaneSeats -= 2;
		System.out.println("New Seat Availability: " + availPlaneSeats);
		
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceryCheckoutPrice += 2.15;
		System.out.println("Grocery Checkout Price With Candy Bar: $"+groceryCheckoutPrice);
		
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'G';
		System.out.println("Corrected Middle Initial: "+middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		hotOutside = false;
		System.out.println("True or False: It's hot out in winter."+hotOutside);
		

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = custFirstName + " " + middleInitial + " " + "Doe";
		System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("The customer's name is "+fullName+" and they live at "+streetAddress);
		
		
	}
}

