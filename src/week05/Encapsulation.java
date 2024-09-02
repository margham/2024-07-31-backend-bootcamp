package week05;

public class Encapsulation {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sal");
		student.setPhoneNumber("129679094");
		student.introduce();
	
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		
/*Access Modifiers:
 * public - accessible everywhere
 * protected - only accessible within the class, other classes in the same
 * 			   package, and all subclasses
 * private - only accessible within the class itself
 * no modifier - the same as protected, except not accessible to sub-
 *               classes in different packages
 * 
 */
	}//end main method
}//end class
