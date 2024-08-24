package week03;

import java.util.Scanner;

public class menu_app {

	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] team = new String[5];
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
		
			if (decision < -1 || decision > 5) {
				System.out.println("Please pick a valid option.");
			} else if (decision == 1) {
				showTeam(team);
			} else if (decision == 2) {
				showTeamMember(team);
			} else if (decision == 3) {
				addTeamMember(team);
			} else if (decision == 4) {
				deleteTeamMember(team);
			} else {
				deleteAllMembers(team);
			}
		}
	}
	private static void showTeam(String[] team) {
		// TODO Auto-generated method stub
		System.out.println("Team:");
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + ": " + team[i]);
		}
	}
	
	public static void deleteAllMembers(String[] team) {
		for (int i = 0; i < team.length; i++) {
			team[i] = null;
		}
	}
	
	public static void deleteTeamMember(String[] team) {
		System.out.println("Which member would you like to delete?");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			team[memberToDelete] = null;
		}	
	}
	
	public static void showTeamMember(String[] team) {
		System.out.println("Which team member would you like to see? Pick number 0 to 4.");
		int position = s.nextInt();
		if (isValid(position)) {
			System.out.println(position + ": " + team[position]);	
		} 
	}

	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();
		if (isValid(addingIndex)) {
			team[addingIndex++] = newMember;
		}
	}
	
	public static boolean isValid(int input) {
		if (input >= 0 && input < 5) {
			return true;
		} else {
			System.out.println("Invalid entry.");
			return false;
		}
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Team Members");
	}
}
