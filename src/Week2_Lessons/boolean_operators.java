package Week2_Lessons;

public class boolean_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2==2);
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 <= 5);
		//&& and || or
		System.out.println(2 == 2 && 1 < 5);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(2 == 2 || 1 == 5);
		
		//old enough to drive?
		int ageRequiredToDrive = 16;
		int currentAge = 14;
		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);
		System.out.println("Can this person drive? " + canPersonDrive);
				
	}

}
