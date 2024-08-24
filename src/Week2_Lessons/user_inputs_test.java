package Week2_Lessons;
import java.util.*;
public class user_inputs_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loggedIn = false;
		Scanner userVerify = new Scanner(System.in);
		int attempts = 0;
		
		while (!loggedIn && attempts < 3) {
		System.out.print("Enter username: ");
		String username = userVerify.nextLine();
		System.out.print("Enter password: ");
		String password = userVerify.nextLine();
		
		if (username.equals("Wally") && password.equals("tacotruck")) {
			System.out.println("Welcome back " + username);
			loggedIn = true;
		} else {
			System.out.println("Inaccurate credentials!");
			attempts ++;
		}
	}
	}
}
