package Week2_Lessons;

import java.util.Scanner;

public class user_inputs {

	public static void main(String[] args) {
	Scanner eggo = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	String name = eggo.nextLine();
	
	System.out.println("Welcome, " + name);

	//initialize starting variables for an interactive shopping cart
	int selection = 0;
	double total = 0;
	//make the loop that will run until the user checks out
	while (selection != 4) {
	System.out.println("Select an option.");
	System.out.println("*1) candy bar: 1.99");
	System.out.println("*2) burrito: 3.95");
	System.out.println("*3) coffee with milk: 1.25");
	System.out.println("*4) checkout");
	
	selection = eggo.nextInt();
	
	switch (selection) {
	case 1:
		total += 1.99;
		break;
	case 2:
		total += 3.95;
		break;
	case 3:
		total += 1.25;
		break;
	case 4: 
		break;
	default:
		System.out.println("Please pick a valid option.");
	}
	System.out.println("Your current total: " + total);
	}
}
}