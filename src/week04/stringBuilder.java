package week04;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.concat(firstName));
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
		//System.out.println(fullName.deleteCharAt(5));
		//System.out.println(fullName.delete(1, 3)); //the last number (3) is exclusive,
		//the deletion will stop at index place 2
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));//replace a portion of 
		//the string with a new string
		System.out.println(fullName.reverse());
	
		//testing string reassignment
		String name = "Bob brown";
		System.out.println(name);
		name = "Sue Brown";
		System.out.println(name);
	}	
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	 }

}
