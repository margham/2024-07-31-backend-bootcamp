package week03;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
	}
	//write the method
	//note we're replacing first and last name in the parameters just to show
	//it doesn't matter what you use there, they're placeholders
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		//can replace the above with:
		//return x + " " + y;
	}
}
