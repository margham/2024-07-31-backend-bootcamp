package week04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu_app_with_list {
	
	static Scanner scanner = new Scanner(System.in);

	//make a list of students at the class level so it's accessible 
	//to all the methods
	static List<String> students = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		
		while (choice != 4) {
			System.out.println("Please select an option.");
			System.out.println("------------------------------------");
			showMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Please selcect a valid option!");
			}
		}
	}//end main menu
	
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student At Position [number]");
		System.out.println("4) Exit");
		System.out.println("------------------------------------");
	}

	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		System.out.print("Enter the name you would like to add: ");
		String firstName = scanner.next();
		String lastName = scanner.next();
		String fullName = firstName + " " + lastName;
		students.add(fullName);
		System.out.println("Student added: " + fullName);
	}
	
	public static void deleteStudent() {
		System.out.print("Enter the index of the student you wish to delete: ");
		int index = getUserChoice();
		if (index < students.size()) {
		students.remove(index);
	}
	}
}//end class
