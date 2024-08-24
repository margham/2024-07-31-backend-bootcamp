package Week2_Lessons;

public class contitional_statements {

	public static void main(String[] args) {
		//set string name
		String name = "Eliot";
		//set thing to run based on the string
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		} else {
			System.out.println("You are not Sam, " + name);
		}
		
		//age for license
		int age = 14;
		
		if (age >= 16) {
			System.out.println("You can get your license!");
		} else {
			System.out.println("Please wait " + (16 - age) + " year(s) to apply.");
		}
		
		//else if statements
		double costOfMilk = 4;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 3");
		} else if (costOfMilk <= 3 ) {
			System.out.println("Buying 2");
		} else {System.out.println("Not buying any milk T-T");
	}
		//switch statements
		
		char grade = 'D';
		
		switch (grade) {
			case 'A':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		}
			//nested 'if' statements - use when nested statment has 
			//multiple paths that could occur
			if (5 == 5) {
				if (4 == 3) {
					System.out.println("5 is 5 and 4 is 4");
				} else {
					System.out.println("5 is 5");
				}
			}
			//non-nested
			if (5 == 5 && 4 == 4) {
				System.out.println("Yes");
			}

		  //many paths
		double costOfEggs = 2.12;
		int numberOfDozensOfEggsToBuy = 0;
		if (costOfEggs > 3) {
			numberOfDozensOfEggsToBuy = 1;
		} else if (costOfEggs > 2) {
			numberOfDozensOfEggsToBuy = 2;
		} else if (costOfEggs > 1) {
			numberOfDozensOfEggsToBuy = 3;
		} else {
			numberOfDozensOfEggsToBuy = 4;
		}

		System.out.println("I will buy " + numberOfDozensOfEggsToBuy + " dozen eggs.");
	}
		
}